package com.example.learner_management.repository;

import com.example.learner_management.entity.Cohort;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CohortRepository extends JpaRepository<Cohort, Long> {
}
