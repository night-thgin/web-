package com.example.web.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class department {
    private String department_id; //ID
    private String department_name; //系名
    private String college_id; //所在学院
}
