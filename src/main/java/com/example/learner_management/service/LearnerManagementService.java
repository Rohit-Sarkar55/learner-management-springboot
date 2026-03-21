package com.example.learner_management.service;

import com.example.learner_management.entity.Learner;
import com.example.learner_management.repository.LearnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LearnerManagementService {
    @Autowired
    LearnerRepository _learnerRepository;

    public void createLearner(Learner learner){
        _learnerRepository.save(learner);
        System.out.println("Learner created successfully");
    }
}
