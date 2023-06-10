package com.odrs.paziresh247365.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ContactController {
    @RequestMapping("/contact")
    public ModelAndView login(){
        ModelAndView modelAndView =new ModelAndView();
        modelAndView.setViewName("contact.html");
        return modelAndView;
    }
}