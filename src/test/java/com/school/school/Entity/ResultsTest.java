package com.school.school.Entity;

import com.school.school.Repository.ResultsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ResultsTest {

    @Autowired
    private ResultsRepository resultsRepository;

    @Test
    public void saveResults() {
        Student student = new Student();
        student.setFirstName("Tom");
        student.setLastName("Cruize");
        student.setEmailId("tom@gmail.com");
        student.setBirthDate("1989-08-19");
        student.setEnterYear("2006");

        Score score = new Score();
        score.setScore(8);

        Subject subject = new Subject();
        subject.setSubject("Science");

        Results results = new Results();
        results.setScore(score);
        results.setStudent(student);
        results.setSubject(subject);
        resultsRepository.save(results);


    }

}