package com.vs_api.vs_user.infra.repository;

import com.vs_api.vs_user.domain.contract.VsUserContract;
import com.vs_api.vs_user.domain.entity.UserEntityVs;
import com.vs_api.vs_user.infra.data.VsUserDatabase;
import com.vs_api.vs_user.infra.dtos.UserDBEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VsUserRepository implements VsUserContract {
    public VsUserRepository(VsUserDatabase database) {
        this.database = database;
    }

    final VsUserDatabase database;

    @Override
    public void createUser(UserEntityVs user) {
        var newUser = new UserDBEntity();
        BeanUtils.copyProperties(user, newUser);
        database.createUser(newUser);
    }

    @Override
    public List<UserEntityVs> getUsers() {
        var dbUserList = database.getUsers().stream().map(item -> {
            var userEntity = new UserEntityVs();
            BeanUtils.copyProperties(item, userEntity);
            userEntity.setUserId(item.getUserId());
            return userEntity;
        }).collect(Collectors.toList());
        return dbUserList;
    }

    @Override
    public UserEntityVs getUserById(String userId) {
        var user = new UserEntityVs();
        var userData = database.getUserById(userId);
        BeanUtils.copyProperties(userData, user);
        return user;
    }

    @Override
    public void updateUser(String userId, UserEntityVs userData) {
        var user = new UserDBEntity();
        BeanUtils.copyProperties(userData, user);
        database.updateUser(userId, user);
    }

    @Override
    public void deleteUser(String userId) {
        database.deleteUser(userId);
    }
}
