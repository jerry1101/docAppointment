package com.example.demo.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Patient;

public interface PatientRepo extends CrudRepository<Patient, Long> {

}
