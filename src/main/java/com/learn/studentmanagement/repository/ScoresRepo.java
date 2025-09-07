package com.learn.studentmanagement.repository;

import com.learn.studentmanagement.models.Scores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoresRepo extends JpaRepository<Scores,Integer> {
}
