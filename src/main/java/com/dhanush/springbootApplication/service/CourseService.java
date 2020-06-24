package com.dhanush.springbootApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhanush.springbootApplication.Bean.Course;
import com.dhanush.springbootApplication.courseRepo.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository courseRepo;

	public List<Course> findAllCourses() {
		
		return courseRepo.findAll();
	}

}
