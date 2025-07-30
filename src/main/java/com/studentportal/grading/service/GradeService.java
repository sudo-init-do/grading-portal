package com.studentportal.grading.service;

import com.studentportal.grading.dto.GradeDto;
import com.studentportal.grading.model.Course;
import com.studentportal.grading.model.Grade;
import com.studentportal.grading.model.Student;
import com.studentportal.grading.repository.CourseRepository;
import com.studentportal.grading.repository.GradeRepository;
import com.studentportal.grading.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GradeService {

    private final GradeRepository gradeRepository;
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    public Grade assignGrade(GradeDto dto) {
        Student student = studentRepository.findById(dto.getStudentId())
                .orElseThrow(() -> new RuntimeException("Student not found"));

        Course course = courseRepository.findById(dto.getCourseId())
                .orElseThrow(() -> new RuntimeException("Course not found"));

        Grade grade = Grade.builder()
                .student(student)
                .course(course)
                .letterGrade(dto.getLetterGrade())
                .build();

        return gradeRepository.save(grade);
    }

    public List<Grade> getGradesByStudent(Long studentId) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found"));
        return gradeRepository.findByStudent(student);
    }

    public List<Grade> getGradesByCourse(Long courseId) {
        Course course = courseRepository.findById(courseId)
                .orElseThrow(() -> new RuntimeException("Course not found"));
        return gradeRepository.findByCourse(course);
    }

     
    public List<Grade> getAllGrades() {
        return gradeRepository.findAll();
    }
}
