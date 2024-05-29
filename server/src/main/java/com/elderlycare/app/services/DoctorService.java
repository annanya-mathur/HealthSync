package com.elderlycare.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.elderlycare.app.doclogin.entity.Doctor;
import com.elderlycare.app.doclogin.repository.DoctorRepository;

@Service
public class DoctorService {
	
    @Autowired
	private DoctorRepository doctorRepository;
	
	
	public List<Doctor> getDoctor()
	{
		return doctorRepository.findAll();
	}
	
	
	public Doctor createDoctor(Doctor doctor)
	{
		return doctorRepository.save(doctor);
	}

}
