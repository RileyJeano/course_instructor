package com.example.courseinstructor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Instructor {
	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;

	public Instructor() {
	}

	public Instructor(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}
