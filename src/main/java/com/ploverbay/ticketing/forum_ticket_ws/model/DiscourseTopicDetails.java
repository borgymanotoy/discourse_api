package com.ploverbay.ticketing.forum_ticket_ws.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DiscourseTopicDetails {

    @SerializedName("created_by")
    private DiscourseTopicUser createdBy;

    @SerializedName("last_poster")
    private DiscourseTopicUser lastPoster;

    @SerializedName("participants")
    private List<DiscourseTopicParticipant> participants;


    public DiscourseTopicUser getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(DiscourseTopicUser createdBy) {
        createdBy = createdBy;
    }

    public DiscourseTopicUser getLastPoster() {
        return lastPoster;
    }

    public void setLastPoster(DiscourseTopicUser lastPoster) {
        lastPoster = lastPoster;
    }

    public List<DiscourseTopicParticipant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<DiscourseTopicParticipant> participants) {
        participants = participants;
    }

}