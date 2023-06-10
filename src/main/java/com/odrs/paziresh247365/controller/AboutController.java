package com.odrs.paziresh247365.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AboutController {
    @RequestMapping("/about")
    public ModelAndView about(){
        ModelAndView modelAndView =new ModelAndView();
        modelAndView.setViewName("about.html");
        return modelAndView;
    }
}
