package com.example.courseinstructor;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.example.courseinstructor.model.CourseTopic;
import com.example.courseinstructor.model.Instructor;
import com.example.courseinstructor.repositories.CourseTopicRepository;
import com.example.courseinstructor.repositories.InstructorRepository;

@Service
public class CourseTopicPopulator implements CommandLineRunner {

	@Resource
	CourseTopicRepository courseRepo;

	@Resource
	InstructorRepository instructorRepo;

	@Override
	public void run(String... args) throws Exception {
		courseRepo.save(new CourseTopic("Spring"));
		courseRepo.save(new CourseTopic("HTML"));
		courseRepo.save(new CourseTopic("Java"));
		courseRepo.save(new CourseTopic("JavaScript"));
		instructorRepo.save(new Instructor("Brian", "Forsythe"));
		instructorRepo.save(new Instructor("Don", "Hamilton"));
		instructorRepo.save(new Instructor("Alan", "Kostrick"));

	}

}
