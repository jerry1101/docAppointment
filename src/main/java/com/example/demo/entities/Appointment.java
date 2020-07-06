package com.example.demo.entities;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@Getter
@ToString
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Timestamp appointment_time;
	private boolean started;
	private boolean ended;
	private String reason;
	@ManyToOne
	private Patient patient;
	@ManyToOne
	private Doctor doctor;
}
