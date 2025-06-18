package com.learn.expensetracker.dto;

public class HealthStatus {
    private boolean backendUp;
    private boolean dbConnected;
    private long sampleDbCount;
    private String message;

    public HealthStatus(boolean backendUp, boolean dbConnected, long sampleDbCount, String message) {
        this.backendUp = backendUp;
        this.dbConnected = dbConnected;
        this.sampleDbCount = sampleDbCount;
        this.message = message;
    }

    public boolean isBackendUp() {
        return backendUp;
    }

    public void setBackendUp(boolean backendUp) {
        this.backendUp = backendUp;
    }

    public boolean isDbConnected() {
        return dbConnected;
    }

    public void setDbConnected(boolean dbConnected) {
        this.dbConnected = dbConnected;
    }

    public long getSampleDbCount() {
        return sampleDbCount;
    }

    public void setSampleDbCount(long sampleDbCount) {
        this.sampleDbCount = sampleDbCount;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
