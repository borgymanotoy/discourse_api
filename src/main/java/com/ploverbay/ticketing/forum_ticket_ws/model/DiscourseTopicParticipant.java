package com.ploverbay.ticketing.forum_ticket_ws.model;

import com.google.gson.annotations.SerializedName;

public class DiscourseTopicParticipant {

    @SerializedName("id")
    private Integer id;

    @SerializedName("username")
    private String username;

    @SerializedName("post_count")
    private Integer postCount;


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

    public Integer getPostCount() {
        return postCount;
    }

    public void setPostCount(Integer postCount) {
        postCount = postCount;
    }

}