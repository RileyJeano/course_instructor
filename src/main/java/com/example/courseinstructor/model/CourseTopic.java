package com.example.courseinstructor.model;

import java.io.Serializable;

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

	public CourseTopic() {
	}

	public CourseTopic(String courseTopicName) {
		this.courseTopicName = courseTopicName;
	}

	public long getId() {
		return id;
	}

	public String getCourseTopicName() {
		return courseTopicName;
	}
}
