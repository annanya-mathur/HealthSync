package com.elderlycare.app.doclogin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elderlycare.app.doclogin.entity.Prescription;

@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription,Integer> {

	List<Prescription> findByPid(int pid);

	
}
