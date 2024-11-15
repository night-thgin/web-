package com.example.web.controller;


import com.example.web.pojo.Result;
import com.example.web.pojo.Teacher;
import com.example.web.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Slf4j
@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

//    @GetMapping("/emps")
//    public Result page(@RequestParam(defaultValue = "1") Integer page,
//                       @RequestParam(defaultValue = "10")Integer pageSize,
//                       String name, Short gender,
//                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
//                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end){
//        log.info("分页查询,参数:{},{},{},{},{},{}",page,pageSize,name,gender,begin,end);
//
//        //调用service分页查询
//        PageBean pageBean=empService.page(page,pageSize,name,gender,begin,end);
//        return Result.success(pageBean);
//    };

    @DeleteMapping("/teacher/{teacher_id}")
    @CrossOrigin(origins = "*")
    public Result detele(@PathVariable String teacher_id){
        log.info("删除操作，ids:{}",teacher_id);
        teacherService.delete(teacher_id);
        return Result.success();
    }

    @PostMapping("/teacher")
    @CrossOrigin(origins = "*")
    public Result save(@RequestBody Teacher teacher){
        log.info("新增教师");
        teacherService.save(teacher);
        return Result.success();
    }

    @GetMapping("/teacher/{teacher_id}")
    @CrossOrigin(origins = "*")
    public Result getById(@PathVariable String teacher_id){
        log.info("根据id查询教师信息");
        Teacher teacher = teacherService.getById(teacher_id);
        return Result.success(teacher);
    }

//    @PutMapping("/emps")
//    public Result update(@RequestBody Emp emp){
//        log.info("更新员工信息:{}",emp);
//        empService.update(emp);
//        return Result.success();
//    }

    @GetMapping("/emps/findAll")
    @CrossOrigin(origins = "*")
    public Result findAll(){
        log.info("查询全部教师数据");
        List<Teacher> teacherList = teacherService.list();
        return Result.success(teacherList);
    }

//    @GetMapping("/emps/genderCount")
//    public Result genderCount(){
//        List<Integer> genderlist = empService.getgenderlist();
//        return Result.success(genderlist);
//    }
//
//    @GetMapping("/emps/jobCount")
//    public Result jobCount(){
//        List<Integer> joblist = empService.getjoblist();
//        return Result.success(joblist);
//    }

}
