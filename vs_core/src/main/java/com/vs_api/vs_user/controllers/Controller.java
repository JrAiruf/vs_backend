package com.vs_api.vs_user.controllers;

import com.vs_api.vs_user.domain.entity.UserEntityVs;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class Controller {

    public Controller(VsUserController controller) {
        this.controller = controller;
    }

    final VsUserController controller;

    @PostMapping
    ResponseEntity<Object> createUser(@RequestBody @Valid UserEntityVs user) {
        return controller.createUser(user);

    }

    @GetMapping
    ResponseEntity<List<UserEntityVs>> getUsers() {
        return controller.getUsers();

    }
    @GetMapping("/{id}")
    ResponseEntity<Object> getUserById(@PathVariable(value= "id")String userId) {
        var result = controller.getUserById(userId);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @PutMapping("/{id}")
    ResponseEntity<Object> updateUser(@PathVariable(value= "id")String userId, @RequestBody UserEntityVs userData) {
        controller.updateUser(userId, userData);
        return ResponseEntity.status(HttpStatus.OK).body(userData);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Object> deleteUser(@PathVariable(value= "id")String userId) {
        controller.deleteUser(userId);
        return ResponseEntity.status(HttpStatus.OK).body("User Deleted:" + userId);
    }
}
