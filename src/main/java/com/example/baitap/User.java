package com.example.baitap;

import java.time.LocalDate;

public class User {
    private String firstName;
    private String lastName;
    private String dob; // Ngày sinh
    private String hometown; // Quê quán

    // Constructor không tham số
    public User() {
    }

    // Constructor có tham số
    public User(String firstName, String lastName, String dob, String hometown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.hometown = hometown;
    }

    // Getter và Setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
}
