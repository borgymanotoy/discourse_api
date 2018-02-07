package com.ploverbay.ticketing.forum_ticket_ws.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DiscoursePostStream {

    @SerializedName("posts")
    private List<DiscourseTopicPost> posts;


    public List<DiscourseTopicPost> getPosts() {
        return posts;
    }

    public void setPosts(List<DiscourseTopicPost> posts) {
        this.posts = posts;
    }

}