package com.ploverbay.ticketing.forum_ticket_ws.util;

import com.google.gson.Gson;
import com.ploverbay.ticketing.forum_ticket_ws.model.DiscourseTopic;
import com.ploverbay.ticketing.forum_ticket_ws.model.DiscourseUser;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class ForumDataExtractionUtil {

    public static DiscourseTopic getDiscourseForumTopicDetails(String forumUrl) {
        if (forumUrl != null) {
            String strResponse = getResponseFromUrl(forumUrl);
            Gson gson = new Gson();
            return gson.fromJson(strResponse, DiscourseTopic.class);
        }
        return null;
    }

    public static DiscourseUser getDiscourseUser(String username, String apiKey, String user) {
        if (username != null) {
            String url = "http://testforum.peplink.com/users/" + username
                    + ".json?api_key=" + apiKey + "&api_username=" + user;
            String strResponse = getResponseFromUrl(url);
            Gson gson = new Gson();
            return gson.fromJson(strResponse, DiscourseUser.class);
        }
        return null;
    }

    private static String getResponseFromUrl(String url) {
        if (url != null && !url.trim().equals("")) {
            RestTemplate restTemplate = new RestTemplate();
            HttpEntity<String> entity = new HttpEntity<>(getHttpHeaders());
            ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
            return response.getBody();
        }
        return null;
    }

    private static HttpHeaders getHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        return headers;
    }

}