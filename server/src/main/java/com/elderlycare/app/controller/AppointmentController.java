package com.elderlycare.app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elderlycare.app.doclogin.entity.Appointments;
import com.elderlycare.app.services.AppointmentService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Map;

import javax.management.AttributeNotFoundException;

@RestController
@RequestMapping("/api/v3")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class AppointmentController {
	
	private final AppointmentService appointmentService;
	
	@GetMapping("/get/appointment")
	public List<Appointments> getAppointments() {
		return appointmentService.getAppointments();
	}

	
	@PostMapping("/create/appointment")
	public Appointments createAppointment(@RequestBody Appointments appointment) {
		return appointmentService.createAppointment(appointment);
	}
    
	@PutMapping("/update/appointment")
	public Appointments updateAppointment(@RequestBody Appointments appointment) {
		return appointmentService.updateAppointment(appointment);
	}
	
	@DeleteMapping("/delete/appointment/{id}")
	public ResponseEntity<Map<String,Boolean>>deleteAppointment(@PathVariable long id) throws AttributeNotFoundException
	{
		return appointmentService.deleteAppointment(id);
	}
	
}
