package com.example.test.Student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    private static final Logger logger = LoggerFactory.getLogger(StudentRepository.class);
    private final JdbcClient client;
//    private List<Student> students = new ArrayList<Student>();

    public StudentRepository(JdbcClient client) {
        this.client = client;
    }

    public List<Student> getStudents() {
//        logger.info(client.sql("select * from student").query(Student.class).list().toString());
        return client.sql("select * from student").query(Student.class).list();
    }
}