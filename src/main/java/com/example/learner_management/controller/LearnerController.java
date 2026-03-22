package com.example.learner_management.controller;

import com.example.learner_management.entity.Learner;
import com.example.learner_management.exception.LearnerNotFoundException;
import com.example.learner_management.service.LearnerManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LearnerController {
    @Autowired
    LearnerManagementService _learnerManagementService;
    @GetMapping("/learners")
    public List<Learner> getAllLearners(){
        return _learnerManagementService.getAllLearners();
    }

    @PostMapping("/learners")
    public void createLearner(@RequestBody Learner learner){
         _learnerManagementService.createLearner(learner);
    }

    @GetMapping("/learners/{learnerId}")
    public ResponseEntity<Learner> getLearnerById(@PathVariable Long learnerId){
        try{
//            return new ResponseEntity<>(_learnerManagementService.getLearnerById(learnerId), HttpStatus.OK);
           return ResponseEntity.ok().body(_learnerManagementService.getLearnerById(learnerId));
        }catch (LearnerNotFoundException e){
            System.out.println(e.getMessage());
            return ResponseEntity.badRequest().body(null);
        }
    }

}
