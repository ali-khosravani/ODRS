package com.odrs.paziresh247365.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class GuideController {
    @RequestMapping("/guide")
    public ModelAndView guide(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("guide.html");
        return modelAndView;
    }
}
