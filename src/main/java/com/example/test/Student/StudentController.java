//package com.example.test.Student;
//
//import jakarta.validation.Valid;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/students")
//public class StudentController {
//    private static final Logger log = LoggerFactory.getLogger(StudentController.class);
//
//    private final StudentRepository studentRepository;
//
//    public StudentController(StudentRepository studentRepository) {
//        this.studentRepository = studentRepository;
//    }
//
//    @GetMapping("")
//    List<Student> findAll() {
//        return studentRepository.findAll();
//    }
//
//    @GetMapping("/{id}")
//    Optional<Student> findById(@PathVariable Integer id) {
//        return studentRepository.findById(id);
//    }
//
//    @ResponseStatus(HttpStatus.CREATED)
//    @PostMapping("")
//    void create(@RequestBody Student student) {
//        studentRepository.create(student);
//    }
//
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    @PutMapping("/{id}")
//    void update(@Valid @RequestBody Student student, @PathVariable Integer id) {
//        studentRepository.update(student,id);
//    }
//
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    @DeleteMapping("/{id}")
//    void delete(@PathVariable Integer id) {
//        studentRepository.delete(studentRepository.findById(id).get());
//    }
//}
