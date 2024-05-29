package com.elderlycare.app.entities;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Patient", uniqueConstraints = @UniqueConstraint(name = "patient_EmailId", columnNames = { "patientEmail" }))
public class Patient {

	@Id
	@Column(name = "patient_id")
	@SequenceGenerator(name = "patient_sequence", sequenceName = "patient_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patient_sequence")
	private int pid; // Primary Key

	@Column(name = "patient_name", nullable = false)
	private String name;

	@Column(name = "patient_email")
	private String email;

	@Column(name = "patient_password")
	private String password;
	
	@Column(name = "patient_age")
	private int age;
	
	@Column(name = "patient_blood_group")
	private String bloodGroup;
	
	@Column(name = "Date")
	@CreationTimestamp
	private LocalDateTime currentDate;

	@Column(name = "Systolic_Blood_Pressure")
	private double systolicbloodPressure;

	@Column(name = "Diastolic_Blood_Pressure")
	private double diastolicbloodPressure;

	@Column(name = "Sugar_Level(mg/dL)")
	private double sugarLevel;

	@Column(name = "Oxygen_Level(%)")
	private double oxygenLevel;

	@Column(name = "Temperature(°C)")
	private double temperature;

	@Column(name = "Heart_Rate(bpm)")
	private double heartRate;

	@Column(name = "Stress_Level")
	private double stressLevel;
	
	@Column(name="prescription")
	private String prescription;
	
	@Column(name="status")
	private String status;
	
	
	


}
