package com.example;


import com.example.components.MessageContainer;
import com.example.model.Util;
import com.google.common.base.Joiner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App implements Runnable {


//    @Value("${message}")
//    private static String message;

    @Autowired
    private MessageContainer messageContainer;

    public static void main(String...args) {
        System.out.println(Joiner.on(" ").join("a", "b"));
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.register(MessageContainer.class);
        Util.doSomething();
        appContext.refresh();
        MessageContainer messageContainer = (MessageContainer)appContext.getBean("messageContainer");
        System.out.println("message: " + messageContainer.getMessage());

    }

    @Override
    public void run() {
        System.out.println("Inside Runnable.run() ");
    }
}
