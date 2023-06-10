package com.odrs.paziresh247365.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class PrivacyController {
    @RequestMapping("/privacy")
    public ModelAndView privacy(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("privacy.html");
        return modelAndView;
    }
}
