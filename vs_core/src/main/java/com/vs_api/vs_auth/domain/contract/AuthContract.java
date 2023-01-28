package com.vs_api.vs_auth.domain.contract;

import com.vs_api.vs_user.domain.entity.UserEntityVs;

public interface AuthContract {
    public UserEntityVs login(String email,String password);
}
