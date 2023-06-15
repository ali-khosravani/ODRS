package com.odrs.paziresh247365.repository;

import com.odrs.paziresh247365.model.Section;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepository extends JpaRepository<Section, Long> {
}
