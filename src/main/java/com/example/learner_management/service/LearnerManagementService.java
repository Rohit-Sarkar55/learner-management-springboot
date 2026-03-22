package com.example.learner_management.service;

import com.example.learner_management.entity.Cohort;
import com.example.learner_management.entity.Learner;
import com.example.learner_management.exception.CohortNotFoundException;
import com.example.learner_management.exception.LearnerNotFoundException;
import com.example.learner_management.repository.CohortRepository;
import com.example.learner_management.repository.LearnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LearnerManagementService {
    @Autowired
    LearnerRepository _learnerRepository;

    @Autowired
    CohortRepository _cohortRepository;

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

    public List<Cohort> getAllCohorts(){
        return _cohortRepository.findAll();
    }

    public Cohort addCohort(Cohort cohort){
        return _cohortRepository.save(cohort);
    }
    public Cohort getById(Long cohortId) throws CohortNotFoundException {
        Optional<Cohort> cohort = _cohortRepository.findById(cohortId);
        if(cohort.isPresent()){
            return cohort.get();
        }else{
            throw new CohortNotFoundException("Cohort Not Found");
        }
    }

    public Cohort assignLearnerToCohort(Long cohortId, Long LearnerId) throws CohortNotFoundException {
        Cohort cohort = getById(cohortId);
        Learner learner = getLearnerById(LearnerId);

        cohort.getLearners().add(learner);
        addCohort(cohort);
        return cohort;
    }
}
