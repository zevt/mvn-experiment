package com.example.components;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

public class MessageContainer {

    @Value("${message}")
    private String message;

    public String getMessage() {
        return message;
    }
}
