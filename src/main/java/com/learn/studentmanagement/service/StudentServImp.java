package com.learn.studentmanagement.service;

import com.learn.studentmanagement.models.Student;
import com.learn.studentmanagement.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServImp implements StudentServ{

    @Autowired
    private StudentRepo studentRepo;
    public Student createNewStudent(Student newStudent) {
        return studentRepo.save(newStudent);
    }
}
