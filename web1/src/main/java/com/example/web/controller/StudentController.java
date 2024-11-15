package com.example.web.controller;


import com.example.web.pojo.*;
import com.example.web.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

//    @GetMapping("/stus")
//    public Result page(@RequestParam(defaultValue = "1") Integer page,
//                       @RequestParam(defaultValue = "10")Integer pageSize,
//                       String name, String stuId,Short education,Short claId
//                       ){
//        log.info("分页查询,参数:{},{},{},{},{},{}",page,pageSize,name,stuId,education,claId);
//
//        //调用service分页查询
//        PageBean pageBean= studentService.page(page,pageSize,name,stuId,education,claId);
//        return Result.success(pageBean);
//    };

    @GetMapping("/student")
    @CrossOrigin(origins = "*")
    public Result selectAll(){
        log.info("查询全部学员信息");
        List<Student> StudentList = studentService.selectAll();

        return Result.success(StudentList);
    }

    @PostMapping("/student")
    @CrossOrigin(origins = "*")
    public Result save(@RequestBody Student student){
        log.info("新增学员,stu：{}",student);
        studentService.save(student);
        return Result.success();
    }

    @DeleteMapping("/student/{student_id}")
    @CrossOrigin(origins = "*")
    public Result detele(@PathVariable String student_id){
        log.info("删除操作，id:{}",student_id);
        studentService.delete(student_id);
        return Result.success();
    }


    @GetMapping("/student/{student_id}")
    @CrossOrigin(origins = "*")
    public Result getById(@PathVariable String student_id){
        log.info("根据id查询学员信息,id:{}",student_id);
        Student student = studentService.getById(student_id);
        //System.out.println(student.getStudentId());
        return Result.success(student);
    }


    @GetMapping("/student1")
    @CrossOrigin(origins = "*")
    public Result selectStudents(
             String major_id,
             String department_id,
             String college_id) {
        log.info("根据专业，院系，学院查询学员信息{},,,{}{}",major_id,department_id,college_id );
        if(major_id==""){
            major_id=null;
        }
        if(department_id==""){
            department_id=null;
        }
        if(college_id==""){
            college_id=null;
        }
        List<Student> studentList= studentService.selectStudent(major_id,department_id,college_id);

        return Result.success(studentList);
    }



//    @PutMapping("/stus")
//    public Result update(@RequestBody Stu stu){
//        log.info("更新学员信息:{}",stu);
//        studentService.update(stu);
//        return Result.success();
//    }

//    @PostMapping("/stus/viol")
//    public Result discPline(@RequestBody Disc disc){
//        log.info("违纪一次");
//        studentService.discPline(disc);
//        return Result.success();
//    }
//
//    @GetMapping("/stus/genderCount")
//    public Result genderCount(){
//        List<Integer> genderlist = studentService.getgenderlist();
//        return Result.success(genderlist);
//    }
}
