package com.StudentSubject.Management.controller;

import com.StudentSubject.Management.entities.StudentEntity;
import com.StudentSubject.Management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping
    public StudentEntity createStudent(@RequestBody StudentEntity student) {
        return studentRepository.save(student);
    }

    @GetMapping
    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }
}
