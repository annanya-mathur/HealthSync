package com.elderlycare.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elderlycare.app.doclogin.entity.Doctor;
import com.elderlycare.app.services.DoctorService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v5")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class DoctorController {
	
	private final DoctorService doctorService;
	
	@GetMapping("/show/doctor")
	public List<Doctor> getDoctor()
	{
		return doctorService.getDoctor();
	}
	
	@PostMapping("/add/doctor")
	public Doctor createDoctor(@RequestBody Doctor doctor)
	{
		return doctorService.createDoctor(doctor);
	}

}
