package com.example.components;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan(basePackages = "com.example.components")
//@PropertySource(value = { "classpath:application.properties" })
public class AppConfiguration {

    @Autowired
    private MessageContainer messageContainer;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean(name = "messageContainer")
    MessageContainer messageContainer() {
        return  this.messageContainer;
    }
}
