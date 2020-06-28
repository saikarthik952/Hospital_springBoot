package com.Hospital.management.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hospital.management.model.Patient;
@Repository
public interface PatientDao extends JpaRepository<Patient,Long> {

}
