package com.example.learner_management.controller;

import com.example.learner_management.entity.Cohort;
import com.example.learner_management.exception.CohortNotFoundException;
import com.example.learner_management.exception.LearnerNotFoundException;
import com.example.learner_management.service.LearnerManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CohortController {

    @Autowired
    LearnerManagementService _learnerManagementService;

    @GetMapping("/cohorts")
    public List<Cohort> getAll(){
        return _learnerManagementService.getAllCohorts();
    }

    @PostMapping("/cohorts")
    public Cohort create(@RequestBody Cohort cohort){
        return _learnerManagementService.addCohort(cohort);
    }

    @GetMapping("/cohorts/{cohortId}")
    public ResponseEntity<Cohort> findById(@PathVariable Long cohortId){
        try {
            return ResponseEntity.ok().body(_learnerManagementService.getById(cohortId));
        }catch (CohortNotFoundException e){
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/cohorts/assignlearner")
    public ResponseEntity<Cohort> assignLearner(@RequestParam(required = true) Long cohortId, @RequestParam(required = true) Long learnerId){
        try{
            return ResponseEntity.ok().body(_learnerManagementService.assignLearnerToCohort(cohortId, learnerId));
        }catch (CohortNotFoundException | LearnerNotFoundException e){
            System.out.println(e.getMessage());
            return ResponseEntity.notFound().build();
        }
    }
}
