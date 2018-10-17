package com.example.courseinstructor.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Instructor {
	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;

//	@OneToMany(mappedBy = "instructor")
//	@JoinColumn(name = "courseTopic_id")
//	private Set<CourseTopic> courses = new HashSet<CourseTopic>();

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
