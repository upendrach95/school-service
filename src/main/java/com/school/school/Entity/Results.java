package com.school.school.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Results {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int result_id;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "student_id",
            referencedColumnName = "studentId"
    )
    private Student student;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "subject_id",
            referencedColumnName = "subjectId"
    )
    private Subject subject;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "score_id",
            referencedColumnName = "scoreId"
    )
    private Score score;
}
