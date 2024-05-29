package com.elderlycare.app.doclogin.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Prescription {
	
	@Id
	@GeneratedValue
	@Column(name = "prescription_id")
	private int id;
	
	
	private String medicine ;
	
	private int dose;
	
	@Column(name ="patient_id")
	private int pid;

}
