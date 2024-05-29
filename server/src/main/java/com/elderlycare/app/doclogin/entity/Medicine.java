package com.elderlycare.app.doclogin.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="medicine")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Medicine {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long mId;
	private String drugName;
	private String stock;
}
