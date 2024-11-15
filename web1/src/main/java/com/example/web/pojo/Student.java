package com.example.web.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String student_id; //ID
    private String student_name; //姓名
    private int sex; //性别
    private String college_id; //所在学院
    private String major_id;//所在专业
}
