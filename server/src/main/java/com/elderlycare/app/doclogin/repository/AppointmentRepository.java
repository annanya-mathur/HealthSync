package com.elderlycare.app.doclogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elderlycare.app.doclogin.entity.Appointments;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointments,Long> {

}
