package com.elderlycare.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.elderlycare.app.doclogin.entity.Medicine;
import com.elderlycare.app.doclogin.repository.MedicineRepository;

@Service
public class MedicineService {
	
    @Autowired
	private MedicineRepository medicineRepository;
	
	
	public List<Medicine> getMedicine() {
		return medicineRepository.findAll();
	}

	public Medicine createMedicine( Medicine medicine) {
		return medicineRepository.save(medicine);
	}

	public Medicine updateMedicine( Medicine medicine) {
		return medicineRepository.save(medicine);
	}

	public void deleteMedicine(long mId) {
		 medicineRepository.deleteById(mId);
	}

}
