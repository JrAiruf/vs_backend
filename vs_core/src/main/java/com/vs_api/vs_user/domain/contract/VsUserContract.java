package com.vs_api.vs_user.domain.contract;

import com.vs_api.vs_user.domain.entity.UserEntityVs;
import java.util.List;

public interface VsUserContract {
    public void createUser(UserEntityVs user);
    public List<UserEntityVs> getUsers();
    public UserEntityVs getUserById(String userId);
    public void updateUser(String userId, UserEntityVs userData);
    public void deleteUser(String userId);
}
