package com.odrs.paziresh247365.controller;

import com.odrs.paziresh247365.repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }


    @RequestMapping(value = "/guide")
    public ModelAndView guide(){
        ModelAndView modelAndView =new ModelAndView();
        modelAndView.setViewName("guide");
        return modelAndView;
    }

    @RequestMapping("/register")
    public ModelAndView register(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("register");
        return modelAndView;
    }

    @Autowired
    private SectionRepository sectionRepository;
    @GetMapping("/reserve")
    public ModelAndView getAllSection(){
        ModelAndView modelAndView=new ModelAndView("reserve");
        modelAndView.addObject("sections" , sectionRepository.findAll());
        return modelAndView;
    }


    @RequestMapping("/privacy")
    public ModelAndView privacy(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("privacy");
        return modelAndView;
    }


    @RequestMapping("/about")
    public ModelAndView about(){
        ModelAndView modelAndView =new ModelAndView();
        modelAndView.setViewName("about");
        return modelAndView;
    }

    @RequestMapping("/contact")
    public ModelAndView concat(){
        ModelAndView modelAndView =new ModelAndView();
        modelAndView.setViewName("contact");
        return modelAndView;
    }

    @RequestMapping("/login")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }

}
