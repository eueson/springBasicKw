package com.eueson.springmvc.annotation.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationAnnoTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = ctx.getBean(User.class);
        System.out.println("User name: " + user.getUserName());
        ctx.registerShutdownHook();
        ctx.close();
    }
}
