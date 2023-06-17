package com.odrs.paziresh247365.repository;

import com.odrs.paziresh247365.model.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor,Long> {
    List<Doctor> findDoctorBySectionId(long sectionId);
}
