package com.example.learner_management.exception;

public class LearnerNotFoundException extends RuntimeException {
    public LearnerNotFoundException(String message) {
        super(message);
    }
}
