package com.elderlycare.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elderlycare.app.entities.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
