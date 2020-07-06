package com.example.demo;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entities.Doctor;
import com.example.demo.entities.Insurance;
import com.example.demo.entities.Patient;
import com.example.demo.repos.DoctorRepo;
import com.example.demo.repos.PatientRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
class DocAppointmentApplicationTests {

	@Autowired
	DoctorRepo doctorRepo;
	@Autowired
	PatientRepo patientReop;

	@Test
	@Ignore
	void testCreateDoctor() {
		Doctor entity = new Doctor();
		entity.setFirst_name("s");
		entity.setLast_name("lname");
		entity.setSpeciality("xxx");
		doctorRepo.save(entity);
	}
	
	
	@Test
	void testCreatePatient() {
		Patient entity = new Patient();
		Insurance entity1 = new Insurance("i1",100d);
		
		entity.setFirst_name("s");
		entity.setLast_name("lname");
		entity.setInsurance(entity1);
		entity.setPhone("11111");
		patientReop.save(entity);
	}

}
