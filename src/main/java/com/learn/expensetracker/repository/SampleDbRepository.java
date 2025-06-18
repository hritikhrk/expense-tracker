package com.learn.expensetracker.repository;

import com.learn.expensetracker.entity.SampleDb;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleDbRepository extends JpaRepository<SampleDb, Long> {}
