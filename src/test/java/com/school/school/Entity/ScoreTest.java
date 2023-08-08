package com.school.school.Entity;

import com.school.school.Repository.ScoreRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ScoreTest {

    @Autowired
    private ScoreRepository scoreRepository;

    @Test
    public void saveScore(){
        Score score = new Score();
        score.setScore(9);
        scoreRepository.save(score);
    }

}