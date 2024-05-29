package com.elderlycare.app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elderlycare.app.doclogin.entity.Medicine;
import com.elderlycare.app.services.MedicineService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v2")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class MedicineController {
	
	private final MedicineService medicineService;
	
	@GetMapping("/get/medicine")
	public List<Medicine> getMedicine() {
		return medicineService.getMedicine();
	}
	
	@PostMapping("/create/medicine")
	public Medicine createMedicine(@RequestBody Medicine medicine) {
		return medicineService.createMedicine(medicine);
	}
    
	@PutMapping("/update/medicine")
	public Medicine updateMedicine(@RequestBody Medicine medicine) {
		return medicineService.updateMedicine(medicine);
	}
	
	
}
