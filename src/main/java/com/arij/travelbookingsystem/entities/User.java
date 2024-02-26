package com.arij.travelbookingsystem.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private String password;
    private String mail;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
