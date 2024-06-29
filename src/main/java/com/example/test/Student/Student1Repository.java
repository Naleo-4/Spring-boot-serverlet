package com.example.test.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Student1Repository extends JpaRepository<Student, Integer> {
    // You can add custom query methods here if needed
}