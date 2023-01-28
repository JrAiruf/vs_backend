package com.vs_api.vs_auth.infra.data;

import com.vs_api.vs_user.infra.dtos.UserDBEntity;

public interface VsAuthDatabase {
    public UserDBEntity login(String email, String password);
}
