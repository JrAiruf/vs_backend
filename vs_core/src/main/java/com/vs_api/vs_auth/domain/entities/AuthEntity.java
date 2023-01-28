package com.vs_api.vs_auth.domain.entities;

public class AuthEntity {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    void setEmail(String value) {
        email = value;
    }

    public String getPassword() {
        return password;
    }

    void setPassword(String value) {
        password = value;
    }
}
