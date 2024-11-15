package com.example.web.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Studentcoursename {
    private Integer id;
    private String student_name; //学生
    private int sex;//性别
    private String course_name; //选课
    private String classroom_id;
}
