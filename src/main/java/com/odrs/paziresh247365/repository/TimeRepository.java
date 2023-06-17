package com.odrs.paziresh247365.repository;

import com.odrs.paziresh247365.model.Time;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TimeRepository extends CrudRepository<Time,Long> {
    List<Time> findTimeByDoctorID(long doctorID);
}
