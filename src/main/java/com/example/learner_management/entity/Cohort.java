package com.example.learner_management.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Cohort {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cohortId;
    private String cohortName;
    private String cohortDesc;

    @ManyToMany
    private List<Learner> learners;

    public Cohort(long cohortId, String cohortName, String cohortDesc, List<Learner> learners) {
        this.cohortId = cohortId;
        this.cohortName = cohortName;
        this.cohortDesc = cohortDesc;
        this.learners = learners;
    }

    public Cohort(String cohortName, String cohortDesc, long cohortId) {
        this.cohortName = cohortName;
        this.cohortDesc = cohortDesc;
        this.cohortId = cohortId;
    }

    public Cohort() {

    }

    public long getCohortId() {
        return cohortId;
    }

    public void setCohortId(long cohortId) {
        this.cohortId = cohortId;
    }

    public String getCohortName() {
        return cohortName;
    }

    public void setCohortName(String cohortName) {
        this.cohortName = cohortName;
    }

    public String getCohortDesc() {
        return cohortDesc;
    }

    public void setCohortDesc(String cohortDesc) {
        this.cohortDesc = cohortDesc;
    }

    public List<Learner> getLearners() {
        return learners;
    }

    public void setLearners(List<Learner> learners) {
        this.learners = learners;
    }
}
