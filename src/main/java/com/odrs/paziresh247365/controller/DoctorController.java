package com.odrs.paziresh247365.controller;

import com.odrs.paziresh247365.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class DoctorController {
    private final DoctorRepository doctorRepository;

    @Autowired
    public DoctorController(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @GetMapping("/doctor-list/{sectionId}")
    public ModelAndView show(@PathVariable("sectionId") long sectionId ){
        ModelAndView modelAndView=new ModelAndView("doctor-list");
        modelAndView.addObject("doctors",doctorRepository.findDoctorBySectionId(sectionId));
        return modelAndView;
    }
}
