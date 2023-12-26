package com.practice.springpractice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class HelloControllerForSpringApproach {   //Controller
    
    @RequestMapping("hello1")
    public String hello(String name, HttpSession session){
 
        session.setAttribute("username", name);  //Data  // Model


        return "hello1";  // Separation of concerns  //view page
    }
}
