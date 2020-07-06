package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entities.Doctor;
import com.example.demo.repos.DoctorRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
class DocAppointmentApplicationTests {

	@Autowired
	DoctorRepo doctorRepo;

	@Test
	void testCreateDoctor() {
		Doctor entity = new Doctor();
		entity.setFirst_name("s");
		entity.setLast_name("lname");
		entity.setSpeciality("xxx");
		doctorRepo.save(entity);
	}

}
