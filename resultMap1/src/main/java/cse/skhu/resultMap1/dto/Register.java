package cse.skhu.resultMap1.dto;

import lombok.Data;

import java.util.Date;

@Data
public class Register {
    int id;
    int studentId;
    int courseId;
    int grade;
    Date createDate;
    Student student;
    Course course;
}