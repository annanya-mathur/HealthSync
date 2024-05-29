package com.elderlycare.app.doclogin.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="appointments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Appointments {
   
	@Id
	@GeneratedValue
	private long aId;
	private String name ;
	private String age;
	private String symptoms;
	private int pid;
	
	
}
