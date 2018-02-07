package com.ploverbay.ticketing.forum_ticket_ws.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.http.HttpStatus;

import java.util.Date;

public class RequestStatusInfo {

    private HttpStatus status;
    private String messageBody;

    @JsonFormat(pattern="dd/MM/yyyy", timezone = "Asia/Hong_Kong")
    private Date statusDate;


    public RequestStatusInfo(){}
    public RequestStatusInfo(HttpStatus status, String messageBody){
        this.status = status;
        this.messageBody = messageBody;
        this.statusDate = new Date();
    }


    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

}