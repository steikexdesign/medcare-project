package com.medcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.medcare.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
