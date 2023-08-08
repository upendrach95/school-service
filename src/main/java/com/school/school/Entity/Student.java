package com.school.school.Entity;

import jakarta.persistence.*;
import lombok.*;
import jakarta.validation.constraints.Email;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString

public class Student {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int studentId;

    @Column(name = "first_name" , nullable = false, length = 100)
    private String firstName;

    @Column(name = "last_name" , nullable = false , length = 100 )
    private String lastName;

    @Email
    @Column(name = "email_id" , nullable = false , length = 50 , unique = true)
    private String emailId;

    @Column(name = "birth_date" , nullable = false , length = 50)
    private String birthDate;

    @Column(name = "enter_year" , nullable = false , length = 4)
    private String enterYear;


}
