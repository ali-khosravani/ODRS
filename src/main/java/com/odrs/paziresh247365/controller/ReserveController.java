package com.odrs.paziresh247365.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ReserveController {
    @RequestMapping("/reserve")
    public ModelAndView reserve(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("reserve.html");
        return modelAndView;
    }
}
