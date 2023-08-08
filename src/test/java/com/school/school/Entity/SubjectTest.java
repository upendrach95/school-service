package com.school.school.Entity;

import com.school.school.Repository.SubjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SubjectTest {

    @Autowired
    private SubjectRepository subjectRepository;

    @Test
    public void saveSubject(){
        Subject subject = new Subject();
        subject.setSubject("Maths");
        subjectRepository.save(subject);
    }

}