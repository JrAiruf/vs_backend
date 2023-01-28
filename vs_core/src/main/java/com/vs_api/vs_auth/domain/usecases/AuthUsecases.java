package com.vs_api.vs_auth.domain.usecases;

import com.vs_api.vs_auth.controllers.IAuthController;
import com.vs_api.vs_auth.domain.contract.AuthContract;
import com.vs_api.vs_user.domain.entity.UserEntityVs;
import org.springframework.stereotype.Service;

@Service
public class AuthUsecases implements IAuthController {
    public AuthUsecases(AuthContract repository) {
        this.repository = repository;
    }

    final AuthContract repository;

    @Override
    public UserEntityVs login(String email, String password) {
        var loginUser = repository.login(email, password);

        return loginUser;
    }
}
