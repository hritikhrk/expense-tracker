package com.learn.expensetracker.service;

import com.learn.expensetracker.dto.HealthStatus;
import com.learn.expensetracker.repository.SampleDbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HealthCheckService {

    @Autowired
    SampleDbRepository sampleDbRepository;

    public HealthStatus checkHealth() {
        try {
            long sampleRecordCount = sampleDbRepository.count();
            return new HealthStatus(true, true, sampleRecordCount, "Backend and DB is up.");
        } catch (Exception e) {
            return new HealthStatus(true, false, 0, "DB connection failed: " + e.getMessage());
        }
    }
}
