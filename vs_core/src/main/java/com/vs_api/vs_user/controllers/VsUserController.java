package com.vs_api.vs_user.controllers;

import com.vs_api.vs_user.domain.entity.UserEntityVs;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface VsUserController {
    ResponseEntity<Object> createUser(UserEntityVs user);
    ResponseEntity<List<UserEntityVs>> getUsers();
    UserEntityVs getUserById(String userId);
    void updateUser(String userId, UserEntityVs userData);
    public void deleteUser(String userId);
}
