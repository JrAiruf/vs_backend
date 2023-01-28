package com.vs_api.vs_auth.infra.dto;

import java.util.UUID;

public class AuthData {
    private UUID userId;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String address;

    public UUID getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    void setEmail(String value) {
        email = value;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String value) {
        password = value;
    }

    public String getAddress() {
        return address;
    }

    void setAddress(String value) {
        address = value;
    }
}
