package com.example.courseinstructor.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.courseinstructor.model.Instructor;

public interface InstructorRepository extends CrudRepository<Instructor, Long> {

}
