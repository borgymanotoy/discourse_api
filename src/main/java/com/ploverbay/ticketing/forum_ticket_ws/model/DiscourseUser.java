package com.ploverbay.ticketing.forum_ticket_ws.model;

import com.google.gson.annotations.SerializedName;

public class DiscourseUser {

    @SerializedName("id")
    private Integer m_id;

    @SerializedName("username")
    private String m_username;

    @SerializedName("name")
    private String m_name;

    @SerializedName("email")
    private String m_email;


    public Integer getId() {
        return m_id;
    }

    public void setId(Integer id) {
        m_id = id;
    }

    public String getUsername() {
        return m_username;
    }

    public void setUsername(String username) {
        m_username = username;
    }

    public String getName() {
        return m_name;
    }

    public void setName(String name) {
        m_name = name;
    }

    public String getEmail() {
        return m_email;
    }

    public void setEmail(String email) {
        m_email = email;
    }

}