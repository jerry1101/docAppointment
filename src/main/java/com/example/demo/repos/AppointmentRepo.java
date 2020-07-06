package com.example.demo.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Appointment;

public interface AppointmentRepo extends CrudRepository<Appointment, Long> {

}
