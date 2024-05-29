package com.elderlycare.app.doclogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elderlycare.app.doclogin.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long>{

}
