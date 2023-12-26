package com.practice.springpractice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class ImprovedHelloControllerForSpringApproach {   //Controller
    
    @RequestMapping("hello2")
    public String hello( @RequestParam("uname") String name, HttpSession session){

        // @RequestParam is an annotation used to bind a web request parameter to a method parameter in a controller. 
        // It is commonly used when you want to extract values from the query string or form data of an HTTP request.
 
        session.setAttribute("username", name);  //Data  // Model


        return "hello2";  // Separation of concerns  //view page
    }
}
