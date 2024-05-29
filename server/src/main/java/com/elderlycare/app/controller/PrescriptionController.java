package com.elderlycare.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elderlycare.app.doclogin.entity.Prescription;
import com.elderlycare.app.services.PrescriptionService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v4")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class PrescriptionController {
	
	private final PrescriptionService prescriptionService;
	
	@PostMapping("/add/medicine")
	public Prescription addMedicine(@RequestBody Prescription prescription)
	{
		return prescriptionService.addMedicine(prescription);
	}
	
	@GetMapping("/get/prescription/{pid}")
	public List<Prescription> getPrescription(@PathVariable int pid)
	{
		return prescriptionService.getPrescription(pid);
	}
	

}
