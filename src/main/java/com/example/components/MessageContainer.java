package com.example.components;


import org.springframework.beans.factory.annotation.Value;

public class MessageContainer {

    @Value("${message}")
    private String message;

    public String getMessage() {
        return message;
    }
}
