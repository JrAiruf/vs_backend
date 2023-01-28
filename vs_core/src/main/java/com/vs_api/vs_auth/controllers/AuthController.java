package com.vs_api.vs_auth.controllers;

import com.vs_api.vs_auth.domain.entities.AuthEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users/auth")
@CrossOrigin(origins = "*")

public class AuthController {

    public AuthController(IAuthController controller) {
        this.controller = controller;
    }

    final IAuthController controller;

    @PostMapping
    ResponseEntity<Object> login(@RequestBody AuthEntity userData) {
        if (userData != null) {
            var user = controller.login(userData.getEmail(), userData.getPassword());
            return ResponseEntity.status(HttpStatus.OK).body(user);
        } else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Login não realizado");
    }

}
