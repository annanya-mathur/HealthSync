package com.elderlycare.app.services;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestBody;

import com.elderlycare.app.entities.Patient;
import com.elderlycare.app.repository.PatientRepository;

@Service
public class PatientService {
	
	@Autowired
    private PatientRepository patientRepository;

	
	public List<Patient> getPatient()
	{
		return patientRepository.findAll();
	}

	public ResponseEntity<Patient> getById(int pid) throws AttributeNotFoundException
	{
		Patient patient =patientRepository.findById(pid).orElseThrow(()-> new AttributeNotFoundException("Patient not found with id" +pid));
	    return ResponseEntity.ok(patient);
	}

	public Patient createPatient( Patient patient)
	{
		return patientRepository.save(patient);
	}
    
	
	public Patient updatePatient(@RequestBody Patient patient)
	{
		return patientRepository.save(patient);
	}

	public ResponseEntity<Map<String,Boolean>>deletePatient(int id) throws AttributeNotFoundException
	{
		Patient patient =patientRepository.findById(id).orElseThrow(()-> new AttributeNotFoundException("Patient not found with id" +id));
	   
		patientRepository.delete(patient);
	   Map<String, Boolean> response=new HashMap<>();
	   response.put("Deleted",Boolean.TRUE);
	   return ResponseEntity.ok(response);
	}

}
