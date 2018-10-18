package com.example.courseinstructor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CourseTopic {

	@Id
	@GeneratedValue
	private Long id;
	private String courseTopicName;

	@ManyToOne
	private Instructor instructor;

	public CourseTopic() {
	}

	public CourseTopic(String courseTopicName, Instructor instructor) {
		this.courseTopicName = courseTopicName;
		this.instructor = instructor;
	}

	public Long getId() {
		return id;
	}

	public String getCourseTopicName() {
		return courseTopicName;
	}

	public Instructor getInstructor() {
		return instructor;
	}
}
