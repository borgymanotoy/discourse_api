package com.ploverbay.ticketing.forum_ticket_ws.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class HistoryLog {

    private String link;
    private String message;
    private String user;

    @JsonFormat(pattern="dd/MM/yyyy", timezone = "Asia/Hong_Kong")
    private Date date;


    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}