package com.odrs.paziresh247365.service;

import com.odrs.paziresh247365.model.Section;
import com.odrs.paziresh247365.repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SectionService {
    @Autowired
    SectionRepository sectionRepository;
    public List<Section> getAllSection(){
        List<Section> sections=new ArrayList<Section>();
        sectionRepository.findAll()
                .forEach(section1 -> sections.add(section1));
    return sections;
    }
}
