package com.learn.springbootioc;

import org.springframework.stereotype.Component;

@Component
public class User {

    public void getUserName() {
        System.out.println("Name is User");
    }
}
