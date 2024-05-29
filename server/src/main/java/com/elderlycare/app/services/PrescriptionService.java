package com.elderlycare.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.elderlycare.app.doclogin.entity.Prescription;
import com.elderlycare.app.doclogin.repository.PrescriptionRepository;

@Service
public class PrescriptionService {
	
	@Autowired
	private PrescriptionRepository prescriptionRepository;
	


	
	public Prescription addMedicine(Prescription prescription)
	{
		return prescriptionRepository.save(prescription);
	}
	
	public List<Prescription> getPrescription(int pid)
	{
		return prescriptionRepository.findByPid(pid);
	}

}
