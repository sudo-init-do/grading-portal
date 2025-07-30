package com.studentportal.grading.service;

import com.studentportal.grading.dto.StudentDto;
import com.studentportal.grading.model.Student;
import com.studentportal.grading.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public Student createStudent(StudentDto dto) {
        Student student = Student.builder()
                .fullName(dto.getFullName())
                .email(dto.getEmail())
                .matricNo(dto.getMatricNo())
                .build();
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with ID: " + id));
    }
}
