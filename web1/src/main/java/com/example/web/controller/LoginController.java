//package com.example.web.controller;
//
//import com.example.web.pojo.Emp;
//import com.example.web.pojo.Result;
//import com.example.web.service.TeacherService;
//import com.example.web.utils.JwtUtils;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Slf4j
//@RestController
//public class LoginController {
//
//    @Autowired
//    private TeacherService empService;
//
//    @PostMapping ("/login")
//    public Result login(@RequestBody Emp emp){
//        log.info(("员工登录"));
//        Emp e= empService.login(emp);
//
//        if(e!=null){
//            Map<String,Object> claims =new HashMap<>();
//            claims.put("id",e.getId());
//            claims.put("name",e.getName());
//            claims.put("username",e.getUsername());
//
//            String jwt =JwtUtils.genersteJwt(claims);
//            return Result.success(jwt);
//        }
//
//        return e!=null?Result.success():Result.error("用户名或密码错误");
//    }
//}
