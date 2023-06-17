package com.odrs.paziresh247365.controller;


import com.odrs.paziresh247365.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TimeController {
    private final TimeRepository timeRepository;

    @Autowired
    public TimeController(TimeRepository timeRepository) {
        this.timeRepository = timeRepository;
    }

    @GetMapping("/set-time/{doctorId}")
    public ModelAndView show(@PathVariable("doctorId") long doctorId ){
        ModelAndView modelAndView=new ModelAndView("set-time");
        modelAndView.addObject("times",timeRepository.findTimeByDoctorID(doctorId));
        return modelAndView;
    }
}
