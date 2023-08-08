package com.school.school.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cascade;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;

    @Column(name = "street" , nullable = false, length = 100)
    private String street;

    @Column(name = "city" , nullable = false, length = 100)
    private String city;

    @Column(name = "state" , nullable = false, length = 100)
    private String state;

    @Column(name = "country" , nullable = false, length = 100)
    private String country;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id" , referencedColumnName = "studentId")
    private Student student;

}
