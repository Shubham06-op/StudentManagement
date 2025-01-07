package com.StudentSubject.Management.repository;

import com.StudentSubject.Management.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}
