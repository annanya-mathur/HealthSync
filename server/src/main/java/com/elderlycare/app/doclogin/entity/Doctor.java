package com.elderlycare.app.doclogin.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "Doctor", uniqueConstraints = @UniqueConstraint(name = "Doctor_Email",columnNames = { "doctoremail" }))
public class Doctor {

	
	@Id
	@Column(name = "Doctor_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long dit;

	@Column(name = "Doctor_Name", nullable = false)
	private String doctorname;
    
	@Column(name ="Doctor_Email", nullable=false)
	private String doctoremail;
	
	@Column(name ="Doctor_Password", nullable=false)
	private String doctorpassword;
	
	@Column(name = "Doctor_Profile")
	private String doctorprofile;

	@Column(name = "Doctor_Yrs_Of_Experience")
	private int doctoryrsofexperience;

	@Column(name = "Doctor_Address")
	private String doctoraddress;
	
	@Column(name = "Doctor_Rating")
	private double doctorrating;

	@Column(name = "Doctor_Consultancy_Fees")
	private String doctorconsultancyfees;
}
