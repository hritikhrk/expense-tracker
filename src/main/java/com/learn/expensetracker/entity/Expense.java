package com.learn.expensetracker.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Expense {
    @Id
    @GeneratedValue
    @UuidGenerator
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "description", length = 200)
    private String description;

    @Column(name = "amount")
    private double amount;

    @Column(name = "date_time")
    private LocalDateTime dateTime;

}
