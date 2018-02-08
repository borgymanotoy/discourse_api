package com.ploverbay.ticketing.forum_ticket_ws.exception;

import com.ploverbay.ticketing.forum_ticket_ws.model.RequestStatusInfo;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.net.UnknownHostException;
import java.nio.file.AccessDeniedException;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = { IllegalArgumentException.class, IllegalStateException.class })
    protected ResponseEntity<Object> handleConflict(RuntimeException ex, WebRequest request) {
        RequestStatusInfo status = new RequestStatusInfo(HttpStatus.CONFLICT, "Argument/State conflict");
        return new ResponseEntity<Object>(status, new HttpHeaders(), HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler({ AccessDeniedException.class,  HttpClientErrorException.class})
    public ResponseEntity<Object> handleAccessDeniedException(Exception ex, WebRequest request) {
        RequestStatusInfo status = new RequestStatusInfo(HttpStatus.FORBIDDEN,
                "You do not have enough access/permission");
        return new ResponseEntity<Object>(status, new HttpHeaders(), HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler({ UnknownHostException.class })
    public ResponseEntity<Object> handleUnknownHostException(Exception ex, WebRequest request) {
        RequestStatusInfo status = new RequestStatusInfo(HttpStatus.NOT_FOUND, "Unable to reach host");
        return new ResponseEntity<Object>(status, new HttpHeaders(), HttpStatus.NOT_FOUND);
    }

}