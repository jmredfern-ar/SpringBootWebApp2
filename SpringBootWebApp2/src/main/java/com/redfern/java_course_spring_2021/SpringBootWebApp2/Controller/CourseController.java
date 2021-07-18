package com.redfern.java_course_spring_2021.SpringBootWebApp2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redfern.java_course_spring_2021.SpringBootWebApp2.Model.Course;
import com.redfern.java_course_spring_2021.SpringBootWebApp2.Service.CourseService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/courses")
	public List<Course> course() {
		return courseService.findAll();
	}
}
