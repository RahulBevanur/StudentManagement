package com.learn.studentmanagement.repository;

import com.learn.studentmanagement.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
