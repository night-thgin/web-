package com.example.web.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Studentcourse {
    private Integer id;
    private String student_id; //学生ID
    private String course_id; //选课ID
}
