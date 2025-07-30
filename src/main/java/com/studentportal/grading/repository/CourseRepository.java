package com.studentportal.grading.repository;

import com.studentportal.grading.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
