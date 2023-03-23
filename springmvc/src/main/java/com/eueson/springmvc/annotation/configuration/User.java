package com.eueson.springmvc.annotation.configuration;

public class User {
    private String userName;
    public User(String userName) {
        this.userName = userName;
        System.out.println("--- Initializing User ---");
    }
    public String getUserName() {
        return userName;
    }
}
