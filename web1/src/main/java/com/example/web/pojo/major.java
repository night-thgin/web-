package com.example.web.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class major {
    private String major_id; //ID
    private String major_name; //专业名
    private String department_id; //所在系
}
