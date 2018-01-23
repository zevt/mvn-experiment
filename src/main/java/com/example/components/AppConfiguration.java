package com.example.components;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {


    @Bean(name = "messageContainer")
    MessageContainer messageContainer() {
        return new MessageContainer();
    }
}
