package com.vs_api.vs_auth.controllers;
import com.vs_api.vs_user.domain.entity.UserEntityVs;

public interface IAuthController {
    UserEntityVs login(String email, String password);
}
