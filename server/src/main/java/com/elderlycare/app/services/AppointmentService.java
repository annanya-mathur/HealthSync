package com.elderlycare.app.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.elderlycare.app.doclogin.entity.Appointments;
import com.elderlycare.app.doclogin.repository.AppointmentRepository;

@Service
public class AppointmentService {

@Autowired
private AppointmentRepository appointmentRepository;
	
	
	public List<Appointments> getAppointments() {
		return appointmentRepository.findAll();
	}

	
	
	public Appointments createAppointment( Appointments appointment) {
		return appointmentRepository.save(appointment);
	}
    
	
	public Appointments updateAppointment( Appointments appointment) {
		return appointmentRepository.save(appointment);
	}
	
	
	public ResponseEntity<Map<String,Boolean>>deleteAppointment( long id) throws AttributeNotFoundException
	{
		Appointments appointment =appointmentRepository.findById(id).orElseThrow(()-> new AttributeNotFoundException("Appointment not found with id" +id));
	   appointmentRepository.delete(appointment);
	   Map<String, Boolean> response=new HashMap<>();
	   response.put("Deleted",Boolean.TRUE);
	   return ResponseEntity.ok(response);
	}

}
