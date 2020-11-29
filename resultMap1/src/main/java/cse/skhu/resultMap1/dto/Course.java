package cse.skhu.resultMap1.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Course {
    int id;
    String courseName;
    int departmentId;
    int unit;
    int professorId;
    Date startDate;
}