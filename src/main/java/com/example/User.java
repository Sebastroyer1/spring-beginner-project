package com.example;

import org.springframework.beans.factory.annotation.Value;

import java.util.Date;

public class User {
    @Value("Sebas")
    private String firstName;
    @Value("Jimenez")
    private String lastName;
    @Value("2000-04-25")
    private String dateOfBirth;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void printName() {
        System.out.println("Name: " + firstName + " " + lastName + " Nacio el:  " + dateOfBirth);
    }
}
