package com.vs_api.vs_user.infra.dtos;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "vs_user")
public class UserDBEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userId;
    @Column(nullable = false, length = 30)
    private String firstName;
    @Column(nullable = false, length = 35)
    private String lastName;
    @Column(nullable = false, unique = true, length = 90)
    private String email;
    @Column(nullable = false, length = 65)
    private String password;
    @Column(length = 90)
    private String address;

    public UUID getUserId() {
        return userId;
    }
    public void setUserId(UUID value) {
        userId = value;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String value) {
        firstName = value;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String value) {
        lastName = value;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String value) {
        email = value;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String value) {
        password = value;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String value) {
        address = value;
    }

}
