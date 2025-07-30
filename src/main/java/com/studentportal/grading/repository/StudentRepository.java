package com.studentportal.grading.repository;

import com.studentportal.grading.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByMatricNo(String matricNo);
}
