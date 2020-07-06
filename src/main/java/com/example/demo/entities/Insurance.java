package com.example.demo.entities;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Embeddable
@AllArgsConstructor
@Getter
@ToString
public class Insurance {
	public String provider_name;
	public Double copay;

	public Insurance() {
	}
}