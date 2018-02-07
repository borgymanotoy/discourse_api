package com.ploverbay.ticketing.forum_ticket_ws.model;

import com.google.gson.annotations.SerializedName;

public class DiscourseTopicUser {

    @SerializedName("id")
    private Integer id;

    @SerializedName("username")
    private String username;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        username = username;
    }

}