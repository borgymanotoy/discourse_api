package com.ploverbay.ticketing.forum_ticket_ws.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class TicketDetails {

    private String m_type;
    private String m_subject;
    private String m_serialNo;
    private String m_forumLink;
    private List<String> m_emailAddresses;
    private String m_contactName;
    private String m_details;
    private List<HistoryLog> m_history;

    @JsonFormat(pattern="dd/MM/yyyy", timezone = "Asia/Hong_Kong")
    private Date topicDate;

    public String getType() {
        return m_type;
    }

    public void setType(String type) {
        this.m_type = type;
    }

    public String getSubject() {
        return m_subject;
    }

    public void setSubject(String subject) {
        this.m_subject = subject;
    }

    public String getSerialNo() {
        return m_serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.m_serialNo = serialNo;
    }

    public String getForumLink() {
        return m_forumLink;
    }

    public void setForumLink(String forumLink) {
        this.m_forumLink = forumLink;
    }

    public List<String> getEmailAddresses() {
        return m_emailAddresses;
    }

    public void setEmailAddresses(List<String> emailAddresses) {
        this.m_emailAddresses = emailAddresses;
    }

    public String getContactName() {
        return m_contactName;
    }

    public void setContactName(String contactName) {
        this.m_contactName = contactName;
    }

    public String getDetails() {
        return m_details;
    }

    public void setDetails(String details) {
        this.m_details = details;
    }

    public List<HistoryLog> getHistory() {
        return m_history;
    }

    public void setHistory(List<HistoryLog> history) {
        this.m_history = history;
    }

    public Date getTopicDate() {
        return topicDate;
    }

    public void setTopicDate(Date topicDate) {
        this.topicDate = topicDate;
    }
}