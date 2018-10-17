package com.example.courseinstructor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CourseTopic {

	@Id
	@GeneratedValue
	private Long id;
	private String courseTopicName;

	public CourseTopic() {
	}

	public CourseTopic(String courseTopicName) {
		this.courseTopicName = courseTopicName;
	}

	public Long getId() {
		return id;
	}

	public String getCourseTopicName() {
		return courseTopicName;
	}
}
