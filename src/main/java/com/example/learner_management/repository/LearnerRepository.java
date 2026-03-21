package com.example.learner_management.repository;

import com.example.learner_management.entity.Learner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LearnerRepository extends JpaRepository<Learner,Long> {
}
