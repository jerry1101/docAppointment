package com.example.demo.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Doctor;

public interface DoctorRepo extends CrudRepository<Doctor, Long> {

}
