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
		Instructor instructor1 = new Instructor("Charles", "Xavier");
		Instructor instructor2 = new Instructor("Tony", "Stark");
		Instructor instructor3 = new Instructor("Steve", "Rogers");
		Instructor instructor4 = new Instructor("Reed", "Richards");
		Instructor instructor5 = new Instructor("Bruce", "Banner");

		instructor1 = instructorRepo.save(instructor1);
		instructor2 = instructorRepo.save(instructor2);
		instructor3 = instructorRepo.save(instructor3);
		instructor4 = instructorRepo.save(instructor4);
		instructor5 = instructorRepo.save(instructor5);

		CourseTopic course1 = new CourseTopic("Controlling Your Power", instructor1);
		CourseTopic course2 = new CourseTopic("Hand To Hand Combat", instructor3);
		CourseTopic course3 = new CourseTopic("Weapon Creation", instructor2);
		CourseTopic course4 = new CourseTopic("Interdimensional Travel 101", instructor4);
		CourseTopic course5 = new CourseTopic("Governmental Contracts: What Not To Do", instructor5);
		CourseTopic course6 = new CourseTopic("I am Steve Rogers: Intergalactic Politics", instructor3);

		courseRepo.save(course1);
		courseRepo.save(course2);
		courseRepo.save(course3);
		courseRepo.save(course4);
		courseRepo.save(course5);
		courseRepo.save(course6);
	}

}
