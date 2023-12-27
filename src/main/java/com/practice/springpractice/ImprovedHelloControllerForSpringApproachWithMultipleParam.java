package com.practice.springpractice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ImprovedHelloControllerForSpringApproachWithMultipleParam {  //Controller
    
    @RequestMapping("hello3")
    public ModelAndView hello( UserDetails ud){

        ModelAndView mav = new ModelAndView();
        mav.addObject("details", ud);  //Data  // Model
        mav.setViewName("hello3");
        return mav;  // Separation of concerns  //view page
    }
}
