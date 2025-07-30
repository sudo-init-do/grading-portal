package com.studentportal.grading.service;

import com.studentportal.grading.dto.CourseDto;
import com.studentportal.grading.model.Course;
import com.studentportal.grading.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;

    public Course createCourse(CourseDto dto) {
        Course course = Course.builder()
                .courseCode(dto.getCourseCode())
                .courseTitle(dto.getCourseTitle())
                .build();
        return courseRepository.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course getCourseById(Long id) {
        return courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found with ID: " + id));
    }
}
