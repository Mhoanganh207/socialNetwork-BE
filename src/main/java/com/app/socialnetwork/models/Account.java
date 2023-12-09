package com.app.socialnetwork.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;

@Entity
@Getter
@Setter
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String password;
    private String email;
    private String avatar;
    private String cover;
    private String description;
    private Date birthdate;
    @UpdateTimestamp
    private Date created_at;

    public Account() {
    }
}
