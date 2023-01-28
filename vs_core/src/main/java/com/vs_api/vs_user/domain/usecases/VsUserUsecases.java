package com.vs_api.vs_user.domain.usecases;

import com.vs_api.vs_user.controllers.VsUserController;
import com.vs_api.vs_user.domain.contract.VsUserContract;
import com.vs_api.vs_user.domain.entity.UserEntityVs;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VsUserUsecases implements VsUserController {
    public VsUserUsecases(VsUserContract repository) {
        this.repository = repository;
    }

    final VsUserContract repository;

    @Override
    public ResponseEntity<Object> createUser(UserEntityVs user) {
        if (user != null) {
            repository.createUser(user);
            return ResponseEntity.status(HttpStatus.CREATED).body("User created");
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    @Override
    public ResponseEntity<List<UserEntityVs>> getUsers() {
        var response = repository.getUsers();
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @Override
    public UserEntityVs getUserById(String userId) {
        return repository.getUserById(userId);
    }

    @Override
    public void updateUser(String userId, UserEntityVs userData) {
        repository.updateUser(userId, userData);
    }

    @Override
    public void deleteUser(String userId) {
        repository.deleteUser(userId);
    }
}
