package com.vs_api.vs_user.domain.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.UUID;

public class UserEntityVs {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String address;

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID value) {
        userId = value;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String value) {
        firstName = value;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String value) {
        lastName = value;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String value) {
        email = value;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String value) {
        password = value;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String value) {
        address = value;
    }
}
