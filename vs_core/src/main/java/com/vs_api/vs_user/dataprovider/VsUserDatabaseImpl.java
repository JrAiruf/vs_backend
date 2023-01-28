package com.vs_api.vs_user.dataprovider;

import com.vs_api.vs_user.infra.data.VsUserDatabase;
import com.vs_api.vs_user.infra.dtos.UserDBEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
public class VsUserDatabaseImpl implements VsUserDatabase {
    public VsUserDatabaseImpl(VsDataprovider dataprovider) {
        this.dataprovider = dataprovider;
    }

    final VsDataprovider dataprovider;

    @Transactional
    @Override
    public void createUser(UserDBEntity user) {
        dataprovider.save(user);
    }

    @Override
    public List<UserDBEntity> getUsers() {
        return dataprovider.findAll();
    }

    @Override
    public UserDBEntity getUserById(String userId) {
        UUID.fromString(userId);
        var user = dataprovider.findById(UUID.fromString(userId)).get();
        if (user != null) {
            return user;
        }
        return null;
    }

    @Override
    public void updateUser(String userId, UserDBEntity userData) {
        var user = dataprovider.findById(UUID.fromString(userId));
        if (user.isPresent()) {
            var dbUser = user.get();
            dataprovider.updateUser(dbUser.getUserId(),
                    dbUser.getFirstName(),
                    dbUser.getLastName(),
                    dbUser.getAddress()
            );
        }
    }

    @Override
    public void deleteUser(String userId) {
        dataprovider.deleteById(UUID.fromString(userId)
        );
    }
}
