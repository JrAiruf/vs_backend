package com.vs_api.vs_auth.dataprovider;

import com.vs_api.vs_auth.infra.data.VsAuthDatabase;
import com.vs_api.vs_user.dataprovider.VsDataprovider;
import com.vs_api.vs_user.infra.dtos.UserDBEntity;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManagerFactory;

@Service
public class AuthDatabase implements VsAuthDatabase {
    public AuthDatabase(VsDataprovider dataprovider, EntityManagerFactory entityManager) {
        this.dataprovider = dataprovider;
    }

    final VsDataprovider dataprovider;

    @Override
    public UserDBEntity login(String email, String password) {
        var loginUser = dataprovider.login(email,password);
        if(loginUser != null){
                return loginUser;
        }
        return null;
    }
}
