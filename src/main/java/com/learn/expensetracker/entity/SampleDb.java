package com.learn.expensetracker.entity;

import jakarta.persistence.*;

@Entity
public class SampleDb {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;

    public SampleDb(Long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }
}
