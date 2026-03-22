package com.example.learner_management.dto;

public class CohortDTO {
    private long cohortId;
    private String cohortName;
    private String cohortDesc;

    public CohortDTO() {
    }

    public CohortDTO(long cohortId, String cohortName, String cohortDesc) {
        this.cohortId = cohortId;
        this.cohortName = cohortName;
        this.cohortDesc = cohortDesc;
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
}
