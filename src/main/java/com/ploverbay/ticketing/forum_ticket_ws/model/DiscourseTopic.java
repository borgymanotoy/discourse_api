package com.ploverbay.ticketing.forum_ticket_ws.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class DiscourseTopic {

    @SerializedName("id")
    private Integer id;

    @SerializedName("title")
    private String title;

    @SerializedName("fancy_title")
    private String fancyTitle;

    @SerializedName("posts_count")
    private Integer postsCount;

    @SerializedName("created_at")
    @JsonFormat(pattern="dd/MM/yyyy", timezone = "Asia/Hong_Kong")
    private Date createdAt;

    @SerializedName("last_posted_at")
    @JsonFormat(pattern="dd/MM/yyyy", timezone = "Asia/Hong_Kong")
    private Date lastPostedAt;

    @SerializedName("views")
    private Integer views;

    @SerializedName("reply_count")
    private Integer replyCount;

    @SerializedName("like_count")
    private Integer likeCount;

    @SerializedName("word_count")
    private Integer wordCount;

    @SerializedName("highest_post_number")
    private Integer highestPostNmber;

    @SerializedName("last_read_post_number")
    private Integer lastReadPostNumber;

    @SerializedName("last_read_post_id")
    private Integer lastReadPostId;

    @SerializedName("visible")
    private Boolean visible;

    @SerializedName("closed")
    private Boolean closed;

    @SerializedName("archived")
    private Boolean archived;

    @SerializedName("has_summary")
    private Boolean hasSummary;

    @SerializedName("architype")
    private String architype;

    @SerializedName("slug")
    private String slug;

    @SerializedName("category_id")
    private Integer categoryId;

    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("pinned_globally")
    private Boolean pinnedGlobally;

    @SerializedName("pinned_at")
    @JsonFormat(pattern="dd/MM/yyyy", timezone = "Asia/Hong_Kong")
    private Date pinnedAt;

    @SerializedName("bookmarked")
    private Boolean bookmarked;

    @SerializedName("participant_count")
    private Integer participantCount;

    @SerializedName("deleted_by")
    private Integer deletedBy;

    @SerializedName("deleted_at")
    @JsonFormat(pattern="dd/MM/yyyy", timezone = "Asia/Hong_Kong")
    private Date deletedAt;

    @SerializedName("details")
    private DiscourseTopicDetails details;

    @SerializedName("post_stream")
    private DiscoursePostStream postStream;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        title = title;
    }

    public String getFancyTitle() {
        return fancyTitle;
    }

    public void setFancyTitle(String fancyTitle) {
        fancyTitle = fancyTitle;
    }

    public Integer getPostsCount() {
        return postsCount;
    }

    public void setPostsCount(Integer postsCount) {
        postsCount = postsCount;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        createdAt = createdAt;
    }

    public Date getLastPostedAt() {
        return lastPostedAt;
    }

    public void setLastPostedAt(Date lastPostedAt) {
        lastPostedAt = lastPostedAt;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        views = views;
    }

    public Integer getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(Integer replyCount) {
        replyCount = replyCount;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        likeCount = likeCount;
    }

    public Integer getWordCount() {
        return wordCount;
    }

    public void setWordCount(Integer wordCount) {
        wordCount = wordCount;
    }

    public Integer getHighestPostNmber() {
        return highestPostNmber;
    }

    public void setHighestPostNmber(Integer highestPostNmber) {
        highestPostNmber = highestPostNmber;
    }

    public Integer getLastReadPostNumber() {
        return lastReadPostNumber;
    }

    public void setLastReadPostNumber(Integer lastReadPostNumber) {
        lastReadPostNumber = lastReadPostNumber;
    }

    public Integer getLastReadPostId() {
        return lastReadPostId;
    }

    public void setLastReadPostId(Integer lastReadPostId) {
        lastReadPostId = lastReadPostId;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        visible = visible;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        closed = closed;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        archived = archived;
    }

    public Boolean getHasSummary() {
        return hasSummary;
    }

    public void setHasSummary(Boolean hasSummary) {
        hasSummary = hasSummary;
    }

    public String getArchitype() {
        return architype;
    }

    public void setArchitype(String architype) {
        architype = architype;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        slug = slug;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        categoryId = categoryId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        userId = userId;
    }

    public Boolean getPinnedGlobally() {
        return pinnedGlobally;
    }

    public void setPinnedGlobally(Boolean pinnedGlobally) {
        pinnedGlobally = pinnedGlobally;
    }

    public Date getPinnedAt() {
        return pinnedAt;
    }

    public void setPinnedAt(Date pinnedAt) {
        pinnedAt = pinnedAt;
    }

    public Boolean getBookmarked() {
        return bookmarked;
    }

    public void setBookmarked(Boolean bookmarked) {
        bookmarked = bookmarked;
    }

    public Integer getParticipantCount() {
        return participantCount;
    }

    public void setParticipantCount(Integer participantCount) {
        participantCount = participantCount;
    }

    public Integer getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(Integer deletedBy) {
        deletedBy = deletedBy;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        deletedAt = deletedAt;
    }

    public DiscourseTopicDetails getDetails() {
        return details;
    }

    public void setDetails(DiscourseTopicDetails details) {
        details = details;
    }

    public DiscoursePostStream getPostStream() {
        return postStream;
    }

    public void setPostStream(DiscoursePostStream postStream) {
        postStream = postStream;
    }
}