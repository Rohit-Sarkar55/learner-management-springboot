package com.example.learner_management.service;

import com.example.learner_management.entity.Learner;
import com.example.learner_management.exception.LearnerNotFoundException;
import com.example.learner_management.repository.LearnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LearnerManagementService {
    @Autowired
    LearnerRepository _learnerRepository;

    public void createLearner(Learner learner){
        _learnerRepository.save(learner);
        System.out.println("Learner created successfully");
    }

    public List<Learner> getAllLearners(){
        return _learnerRepository.findAll();
    }

    public Learner getLearnerById(Long learnerId){
         Optional<Learner> learner= _learnerRepository.findById(learnerId);
         if(learner.isPresent()){
             return learner.get();
         }else{
             throw new LearnerNotFoundException("Learner not Found");
         }
    }
}
