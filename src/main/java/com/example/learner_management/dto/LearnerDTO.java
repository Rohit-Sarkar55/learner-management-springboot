package com.example.learner_management.dto;

import com.example.learner_management.entity.Cohort;
import jakarta.persistence.ManyToMany;

import java.util.List;

public class LearnerDTO {
    private long learnerId;
    private String learnerName;
    private String learnerEmail;
    private String learnerPhone;


    private List<CohortDTO> cohorts;

    public long getLearnerId() {
        return learnerId;
    }

    public void setLearnerId(long learnerId) {
        this.learnerId = learnerId;
    }

    public String getLearnerName() {
        return learnerName;
    }

    public void setLearnerName(String learnerName) {
        this.learnerName = learnerName;
    }

    public String getLearnerEmail() {
        return learnerEmail;
    }

    public void setLearnerEmail(String learnerEmail) {
        this.learnerEmail = learnerEmail;
    }

    public String getLearnerPhone() {
        return learnerPhone;
    }

    public void setLearnerPhone(String learnerPhone) {
        this.learnerPhone = learnerPhone;
    }

    public List<CohortDTO> getCohorts() {
        return cohorts;
    }

    public void setCohorts(List<CohortDTO> cohorts) {
        this.cohorts = cohorts;
    }
}
