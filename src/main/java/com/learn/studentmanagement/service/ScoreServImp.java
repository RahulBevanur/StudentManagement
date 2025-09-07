package com.learn.studentmanagement.service;

import com.learn.studentmanagement.models.Scores;
import com.learn.studentmanagement.repository.ScoresRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreServImp implements ScoreServ{

    @Autowired
    private ScoresRepo scoresRepo;
    @Override
    public Scores addScore(Scores newScore) {
        return scoresRepo.save(newScore);
    }
}
