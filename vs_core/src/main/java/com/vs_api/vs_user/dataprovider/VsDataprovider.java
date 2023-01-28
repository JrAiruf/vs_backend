package com.vs_api.vs_user.dataprovider;

import com.vs_api.vs_user.infra.dtos.UserDBEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface VsDataprovider extends JpaRepository<UserDBEntity, UUID> {
    @Query(value = "SELECT * FROM vs_user WHERE email = ?1 and password = ?2", nativeQuery = true)
    public UserDBEntity login(String email, String password);
    @Query(value = "UPDATE vs_user SET first_name=?2, last_name=?3, address=?4 WHERE user_id = ?1", nativeQuery = true)
    public UserDBEntity updateUser(UUID userId, String firstName, String lastName, String address);
}
