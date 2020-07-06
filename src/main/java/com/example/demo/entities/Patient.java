package com.example.demo.entities;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String first_name;
	private String last_name;
	private String phone;
	@Embedded
	private Insurance insurance;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "patients_doctors", joinColumns = {
			@JoinColumn(name = "patient_id", referencedColumnName = "id", nullable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "doctor_id", referencedColumnName = "id", nullable = false) })
	List<Doctor> doctors;
	
	@OneToMany(fetch = FetchType.EAGER)
	List<Appointment> appointments;

}

//id int PRIMARY KEY AUTO_INCREMENT,
//first_name varchar(20),
//last_name varchar(30),
//phone varchar(30),
//provider_name varchar(30),
//copay decimal(10,5)
