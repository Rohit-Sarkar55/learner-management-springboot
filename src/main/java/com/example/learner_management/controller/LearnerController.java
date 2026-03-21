package com.example.learner_management.controller;

import com.example.learner_management.entity.Learner;
import com.example.learner_management.service.LearnerManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LearnerController {
    @Autowired
    LearnerManagementService _learnerManagementService;
    @GetMapping("/learners")
    public String getAllLearners(){
        return "Fetching all learners" ;
    }

    @PostMapping("/learners/create-learner")
    public void createLearner(@RequestBody Learner learner){
         _learnerManagementService.createLearner(learner);
    }
}
