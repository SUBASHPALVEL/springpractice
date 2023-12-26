package com.practice.springpractice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;

@Controller
public class ImprovedHelloControllerForSpringApproachWithMultipleParam {  //Controller
    
    @RequestMapping("hello3")
    public ModelAndView hello( @RequestParam("uname") String name, HttpSession session){

        ModelAndView mav = new ModelAndView();
        mav.addObject("username", name);  //Data  // Model
        mav.setViewName("hello3");
        


        return mav;  // Separation of concerns  //view page
    }
}
