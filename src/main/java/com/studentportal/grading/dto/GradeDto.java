package com.studentportal.grading.dto;

import lombok.Data;

@Data
public class GradeDto {
    private Long studentId;
    private Long courseId;
    private String letterGrade;
}
