package com.arij.travelbookingsystem.entities;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.Set;

import java.util.HashSet;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false, unique = true)
    private String mail;
    public enum Role {
        ROLE_USER,
        ROLE_ADMIN,
        ROLE_AGENT
    }

    @ElementCollection(fetch = FetchType.EAGER)
    //rahou les roles bch ytsajlou fi seperate table(user_roles) w EAGER fetching indicates that the roles should be loaded eagerly (i.e., at the same time as the user entity) rather than lazily (i.e., when explicitly accessed).
    @CollectionTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> roles = new HashSet<>();

    public User() {
    }

    public User(String username, String password, String mail, Set<Role> roles) {
        this.username = username;
        this.password = password;
        this.mail = mail;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
