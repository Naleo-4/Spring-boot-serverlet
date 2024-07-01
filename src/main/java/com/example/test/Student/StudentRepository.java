//package com.example.test.Student;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.jdbc.core.simple.JdbcClient;
//import org.springframework.stereotype.Repository;
//import org.springframework.util.Assert;
//
//import java.util.List;
//
//
//@Repository
//public abstract class StudentRepository implements JpaRepository<Student, Integer> {
//
//    private static final Logger logger = LoggerFactory.getLogger(StudentRepository.class);
//    private final JdbcClient client;
//
////    private List<Student> students = new ArrayList<Student>();
//
//    public StudentRepository(JdbcClient client) {
//        this.client = client;
//    }
//
////    public List<Student> findAll() {
////        return client.sql("select * from student").query(Student.class).list();
////    }
//
////    public Optional<Student> findById(Integer id) {
////        return client.sql("SELECT id,name FROM student WHERE id = :id")
////                .param("id",id)
////                .query(Student.class)
////                .optional();
////    }
//
//    public void create(Student student) {
//        var updated = client.sql("INSERT INTO student(id, name) VALUES (?, ?)")
//                .params(List.of(student.getId(), student.getName()))
//                .update();
//        Assert.state(updated == 1, "FAILED : failed to create student");
//    }
//
//    public void update(Student student, Integer id) {
//        var updated = client.sql("UPDATE student SET name = ? WHERE id = ?")
//                .params(List.of(student.getName(), id))
//                .update();
//        Assert.state(updated == 1, "FAILED : failed to update student");
//    }
//
////    public void delete(Integer id) {
////        var updated = client.sql("DELETE FROM student WHERE id = :id")
////                .param("id",id)
////                .update();
////        Assert.state(updated == 1, "FAILED : failed to update student");
////    }
//
////    public int count() {
////        return client.sql("SELECT * FROM student").query().listOfRows().size();
////    }
//
//    public void saveAll(List<Student> students) {
//        students.forEach(this::create);
//    }
//
//}