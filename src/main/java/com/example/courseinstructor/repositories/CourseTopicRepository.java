package com.example.courseinstructor.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.courseinstructor.model.CourseTopic;

public interface CourseTopicRepository extends CrudRepository<CourseTopic, Long> {

}
