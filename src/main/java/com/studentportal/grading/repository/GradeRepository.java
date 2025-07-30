package com.studentportal.grading.repository;

import com.studentportal.grading.model.Grade;
import com.studentportal.grading.model.Student;
import com.studentportal.grading.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GradeRepository extends JpaRepository<Grade, Long> {
    List<Grade> findByStudent(Student student);
    List<Grade> findByCourse(Course course);
}
