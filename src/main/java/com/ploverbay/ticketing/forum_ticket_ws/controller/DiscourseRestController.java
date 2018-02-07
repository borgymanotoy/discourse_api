package com.ploverbay.ticketing.forum_ticket_ws.controller;

import com.ploverbay.ticketing.forum_ticket_ws.model.*;
import com.ploverbay.ticketing.forum_ticket_ws.util.ForumDataExtractionUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class DiscourseRestController {

    @Autowired
    private String discourseApiKey;


    @GetMapping(value = "/topic-details")
    public ResponseEntity<?> topicDetails(@RequestParam(value = "forum", required = false) String url,
                                          @RequestParam(value = "key", required = false) String apiKey){
        String forumUrl = appendApiInfo(url, apiKey, "system");
        DiscourseTopic topic = ForumDataExtractionUtil.getDiscourseForumTopicDetails(forumUrl);
        return new ResponseEntity<Object>(topic, HttpStatus.OK);
    }

    @GetMapping(value = "/forum-ticket")
    public ResponseEntity<?> getForumTicket(@RequestParam(value = "forum", required = false) String url,
                                          @RequestParam(value = "key", required = false) String apiKey){
        String forumUrl = appendApiInfo(url, apiKey, "system");
        DiscourseTopic topic = ForumDataExtractionUtil.getDiscourseForumTopicDetails(forumUrl);
        TicketDetails ticketDetails = new TicketDetails();
        ticketDetails.setForumLink(url);
        String customerUsername = null;
        if (topic != null && topic.getDetails() != null) {
            ticketDetails.setTopicDate(topic.getCreatedAt());
            List<DiscourseTopicParticipant> participants = topic.getDetails().getParticipants();
            if(participants != null && participants.size() > 0) {
                customerUsername = participants.get(0).getUsername();
                if (customerUsername != null) {
                    DiscourseUser user = ForumDataExtractionUtil.getDiscourseUser(customerUsername, apiKey, "system");
                    if (user != null) {
                        List<String> emailAddresses = new ArrayList<>();
                        emailAddresses.add(user.getEmail());
                        ticketDetails.setContactName(user.getName());
                        ticketDetails.setEmailAddresses(emailAddresses);
                    }
                }
            }
        }

        List<HistoryLog> historyLogs = new ArrayList<>();
        if (topic != null && topic.getPostStream() != null && topic.getPostStream().getPosts() != null) {
            String subject = null;
            for (DiscourseTopicPost p : topic.getPostStream().getPosts()) {
                if (p.getUsername() != null && !p.getUsername().equalsIgnoreCase("system")) {
                    if (subject == null) {
                        subject = cleanupSubject(p.getCooked());
                    }
                    HistoryLog history = new HistoryLog();
                    history.setLink(url + "/" + p.getPostNumber());
                    history.setUser(p.getUsername());
                    history.setMessage(cleanupSubject(p.getCooked()));
                    history.setDate(p.getUpdatedAt());
                    historyLogs.add(history);
                }
            }
            ticketDetails.setSubject(subject);
            ticketDetails.setHistory(historyLogs);
        }

        return new ResponseEntity<Object>(ticketDetails, HttpStatus.OK);
    }

    private String appendApiInfo(String url, String apiKey, String username) {
        if (url != null) {
            url += ".json";
            if (apiKey != null) {
                url += "?api_key=" + apiKey;
            }
            if (username !=null) {
                url += "&api_username=" + username;
            }
            return url;
        }
        return null;
    }

    private String cleanupSubject(String subject) {
        if (subject != null) {
            Document doc = Jsoup.parse(subject);
            return doc.text();
        }
        return null;
    }
}