package com.example.test.Student;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity(name = "student")
@Table(name = "student", schema = "TESTful_API")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int Id;

    @Column(name = "name")
    String Name;

}
