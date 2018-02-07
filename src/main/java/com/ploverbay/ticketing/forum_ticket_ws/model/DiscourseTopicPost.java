package com.ploverbay.ticketing.forum_ticket_ws.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class DiscourseTopicPost {

    @SerializedName("id")
    private Integer id;

    @SerializedName("name")
    private String name;

    @SerializedName("username")
    private String username;

    @SerializedName("created_at")
    @JsonFormat(pattern="dd/MM/yyyy", timezone = "Asia/Hong_Kong")
    private Date createdAt;

    @SerializedName("updated_at")
    @JsonFormat(pattern="dd/MM/yyyy", timezone = "Asia/Hong_Kong")
    private Date updatedAt;

    @SerializedName("cooked")
    private String cooked;

    @SerializedName("post_type")
    private Integer postType;

    @SerializedName("post_number")
    private Integer postNumber;

    @SerializedName("reply_count")
    private Integer replyCount;

    @SerializedName("reads")
    private Integer reads;

    @SerializedName("version")
    private Integer version;

    @SerializedName("topic_id")
    private Integer topicId;

    @SerializedName("topic_slug")
    private String topicSlug;

    @SerializedName("display_username")
    private String displayUsername;

    @SerializedName("yours")
    private Boolean yours;

    @SerializedName("read")
    private Boolean read;

    @SerializedName("hidden")
    private Boolean hidden;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        username = username;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        updatedAt = updatedAt;
    }

    public String getCooked() {
        return cooked;
    }

    public void setCooked(String cooked) {
        cooked = cooked;
    }

    public Integer getPostType() {
        return postType;
    }

    public void setPostType(Integer postType) {
        postType = postType;
    }

    public Integer getPostNumber() {
        return postNumber;
    }

    public void setPostNumber(Integer postNumber) {
        postNumber = postNumber;
    }

    public Integer getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(Integer replyCount) {
        replyCount = replyCount;
    }

    public Integer getReads() {
        return reads;
    }

    public void setReads(Integer reads) {
        reads = reads;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        version = version;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        topicId = topicId;
    }

    public String getTopicSlug() {
        return topicSlug;
    }

    public void setTopicSlug(String topicSlug) {
        topicSlug = topicSlug;
    }

    public String getDisplayUsername() {
        return displayUsername;
    }

    public void setDisplayUsername(String displayUsername) {
        displayUsername = displayUsername;
    }

    public Boolean getYours() {
        return yours;
    }

    public void setYours(Boolean yours) {
        yours = yours;
    }

    public Boolean getRead() {
        return read;
    }

    public void setRead(Boolean read) {
        read = read;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        hidden = hidden;
    }

}