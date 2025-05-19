package com.example;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorld {

    @Autowired
    private User user;

    public void sayHello() {
        System.out.println("Hello World " + user.getFirstName() + " " + user.getLastName()+" " + user.getDateOfBirth());
    }
}