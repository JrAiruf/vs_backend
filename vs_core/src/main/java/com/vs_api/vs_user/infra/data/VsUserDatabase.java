package com.vs_api.vs_user.infra.data;

import com.vs_api.vs_user.infra.dtos.UserDBEntity;

import java.util.List;

public interface VsUserDatabase {
    public void createUser(UserDBEntity user);
    public List<UserDBEntity> getUsers();
    public UserDBEntity getUserById(String userId);
    public void updateUser(String userId, UserDBEntity userData);
    public void deleteUser(String userId);
}
