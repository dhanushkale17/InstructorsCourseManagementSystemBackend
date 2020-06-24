package com.dhanush.springbootApplication.courseRepo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dhanush.springbootApplication.Bean.Course;

@Repository
public class CourseRepository {//extends CrudRepository<Long,Course> {  //plan to implement DB part later
	
	List<Course> coursesList = Arrays.asList(
			new Course(1L, "Learn SpringBoot in 30 days", "Dhanush Kale"),
			new Course(2L, "Learn SpringBoot in 60 days", "Dhanush Kale"),
			new Course(3L, "Learn SpringBoot in 90 days", "Dhanush Kale")
			);
	public List<Course> findAll(){
		
		return  coursesList;
	}

}
