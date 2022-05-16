package com.example.flightbooking.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
public @Data class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;
    private String password;
    private String role;
    private boolean enabled;
}
