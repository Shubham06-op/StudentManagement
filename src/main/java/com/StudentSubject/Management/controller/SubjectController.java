package com.StudentSubject.Management.controller;

import com.StudentSubject.Management.entities.SubjectEntity;
import com.StudentSubject.Management.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

    @Autowired
    private SubjectRepository subjectRepository;

    @PostMapping
    public SubjectEntity createSubject(@RequestBody SubjectEntity subject) {
        return subjectRepository.save(subject);
    }

    @GetMapping
    public List<SubjectEntity> getAllSubjects() {
        return subjectRepository.findAll();
    }
}
