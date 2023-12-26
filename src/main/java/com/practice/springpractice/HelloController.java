package com.practice.springpractice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HelloController {

    @RequestMapping("hello")
    public String hello(HttpServletRequest request) {

        HttpSession session = request.getSession();
        String s = request.getParameter("name");
        session.setAttribute("username", s);


        return "hello"; 
    }
}