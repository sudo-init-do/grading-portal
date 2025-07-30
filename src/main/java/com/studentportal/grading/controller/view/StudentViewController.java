package com.studentportal.grading.controller.view;

import com.studentportal.grading.model.Student;
import com.studentportal.grading.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class StudentViewController {

    private final StudentRepository studentRepository;

    @GetMapping("/students")
    public String viewAllStudents(Model model) {
        List<Student> students = studentRepository.findAll();
        model.addAttribute("students", students);
        return "students"; // returns students.html
    }
}
