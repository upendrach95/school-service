package com.school.school.Entity;
import com.school.school.Repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class StudentTest {
 @Autowired
    private StudentRepository studentRepository;

@Test
 public void saveStudents(){
     Student student = new Student();
     student.setFirstName("John");
     student.setLastName("Goggler");
     student.setEmailId("john@gmail.com");
     student.setBirthDate("1985-08-11");
     student.setEnterYear("2005");
     studentRepository.save(student);
 }

// @Test
// public void getAllStudents(){
//    List<Student> studentsList = studentRepository.findAll();
//     System.out.println("The list of students: "+studentsList);
//
// }

}