//package com.example.web.filter;
//
//
//import com.alibaba.fastjson.JSONObject;
//import com.example.web.pojo.Result;
//import com.example.web.utils.JwtUtils;
//import jakarta.servlet.*;
//import jakarta.servlet.annotation.WebFilter;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.util.StringUtils;
//
//import java.io.IOException;
//
//@Slf4j
//@WebFilter(urlPatterns = "/*")
//public class LoginCheckFilter implements Filter {
//    @Override
//    public void doFilter (ServletRequest request, ServletResponse response, FilterChain chain)throws IOException, ServletException
//    {
//        HttpServletRequest req = (HttpServletRequest) request;
//        HttpServletResponse resp=(HttpServletResponse) response;
//
//        String url = req.getRequestURL().toString();
//
//        if(url.contains("login")){
//            chain.doFilter(request,response);
//            return;
//        }
//
//        String jwt = req.getHeader("token");
//
//        if(!StringUtils.hasLength(jwt)){
//            Result error =Result.error("NOT_LOGIN");
//
//            String notLogin = JSONObject.toJSONString(error);
//            resp.getWriter().write(notLogin);
//            return;
//        }
//
//        try{
//            JwtUtils.parseJWT(jwt);
//        }catch (Exception e){
//            e.printStackTrace();
//            Result error =Result.error("NOT_LOGIN");
//            String notLogin = JSONObject.toJSONString(error);
//            resp.getWriter().write(notLogin);
//            return;
//        }
//
//        chain.doFilter(request,response);
//
//    }
//}
