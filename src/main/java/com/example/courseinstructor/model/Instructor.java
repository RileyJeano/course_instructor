package com.example.courseinstructor.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "instructorClasses")
public class Instructor implements Serializable {

//	@OneToMany(mappedBy = "Instructor")
//	private Set<CourseTopic> courses = new HashSet<CourseTopic>();

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
