package com.medcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.medcare.model.Appointment;
import com.medcare.repository.AppointmentRepository;

import java.util.List;

@RestController
@RequestMapping("/api/appointments")
@CrossOrigin("*")
public class AppointmentController {

    @Autowired
    private AppointmentRepository repository;

    @PostMapping
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        return repository.save(appointment);
    }

    @GetMapping
    public List<Appointment> getAppointments(){
        return repository.findAll();
    }
}