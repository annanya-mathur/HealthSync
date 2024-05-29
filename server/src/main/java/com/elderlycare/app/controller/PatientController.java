package com.elderlycare.app.controller;


import java.util.List;
import java.util.Map;

import javax.management.AttributeNotFoundException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elderlycare.app.entities.Patient;
import com.elderlycare.app.services.PatientService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class PatientController {
	
	private final PatientService patientService;
	
	@GetMapping("/get/patient")
	public List<Patient> getPatient()
	{
		return patientService.getPatient();
	}
	
	@GetMapping("/get/patient/{pid}")
	public ResponseEntity<Patient> getById(@PathVariable int pid) throws AttributeNotFoundException
	{
		return patientService.getById(pid);
	}
	@PostMapping("/create/patient")
	public Patient createPatient(@RequestBody Patient patient)
	{
		return patientService.createPatient(patient);
	}
    
	@PutMapping("/update/patient")
	public Patient updatePatient(@RequestBody Patient patient)
	{
		return patientService.updatePatient(patient);
	}
	
	@DeleteMapping("/delete/patient/{id}")
	public ResponseEntity<Map<String,Boolean>>deletePatient(@PathVariable int id) throws AttributeNotFoundException
	{
		return patientService.deletePatient(id);
	}
}
