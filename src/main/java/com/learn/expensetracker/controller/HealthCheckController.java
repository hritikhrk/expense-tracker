package com.learn.expensetracker.controller;

import com.learn.expensetracker.dto.HealthStatus;
import com.learn.expensetracker.repository.SampleDbRepository;
import com.learn.expensetracker.service.HealthCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HealthCheckController {
    private final SampleDbRepository sampleDbRepository;

    @Value("${spring.datasource.url:Not Configured}")
    private String dbUrl;

    @Autowired
    HealthCheckService healthCheckService;

    public HealthCheckController(SampleDbRepository sampleDbRepository) {
        this.sampleDbRepository = sampleDbRepository;
    }

    @GetMapping("/health")
    public HealthStatus checkHealth() {
        return healthCheckService.checkHealth();

    }
}
