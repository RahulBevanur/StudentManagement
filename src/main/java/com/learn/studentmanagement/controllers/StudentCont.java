package com.learn.studentmanagement.controllers;

import com.learn.studentmanagement.models.Scores;
import com.learn.studentmanagement.models.Student;
import com.learn.studentmanagement.service.ScoreServ;
import com.learn.studentmanagement.service.ScoreServImp;
import com.learn.studentmanagement.service.StudentServ;
import com.learn.studentmanagement.service.StudentServImp;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student/api")
public class StudentCont {

    @Autowired
    private StudentServ studentServImp;
    @Autowired
    private ScoreServ scoreServ;

    @PostMapping("/add")
    public Student createStudent(@Valid @RequestBody Student newStudent, Scores newScores){
        scoreServ.addScore(newScores);
        return studentServImp.createNewStudent(newStudent);
    }
}
