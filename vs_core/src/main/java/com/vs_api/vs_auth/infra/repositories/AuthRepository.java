package com.vs_api.vs_auth.infra.repositories;

import com.vs_api.vs_auth.domain.contract.AuthContract;
import com.vs_api.vs_auth.infra.data.VsAuthDatabase;
import com.vs_api.vs_user.domain.entity.UserEntityVs;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class AuthRepository implements AuthContract {

    public AuthRepository(VsAuthDatabase database) {
        this.database = database;
    }

    final VsAuthDatabase database;

    @Override
    public UserEntityVs login(String email, String password) {
        var loginUser = new UserEntityVs();
        var dbUser = database.login(email, password);
        if (dbUser != null) {
            loginUser.setUserId(dbUser.getUserId());
            BeanUtils.copyProperties(dbUser, loginUser);
            return loginUser;
        }
        return null;
    }
}