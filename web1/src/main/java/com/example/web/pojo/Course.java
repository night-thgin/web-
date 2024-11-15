package com.example.web.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    private String course_id; //ID
    private String course_name; //学院名
    private String classroom_id;//教室名
    private Integer count;
}
