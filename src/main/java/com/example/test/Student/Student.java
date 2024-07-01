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
    private int id;

    @Column(name = "name")
    private String name;

//    public Student(String name, Integer id) {
//        name = name;
//        id = id;
//    }
//
//    public Student() {
//
//    }
}
