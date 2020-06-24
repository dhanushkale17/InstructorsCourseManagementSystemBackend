package com.dhanush.springbootApplication.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dhanush.springbootApplication.Bean.Course;
import com.dhanush.springbootApplication.service.CourseService;

@RestController
public class CourseResourceController {
	
	@Autowired
	CourseService courseService;
	
	@GetMapping("/{username}/courses")
	public List<Course> findAll(@PathVariable String username){
		return courseService.findAllCourses();
	}
}
