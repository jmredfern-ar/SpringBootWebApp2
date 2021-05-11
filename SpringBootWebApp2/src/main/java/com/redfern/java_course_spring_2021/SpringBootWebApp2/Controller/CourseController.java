package com.redfern.java_course_spring_2021.SpringBootWebApp2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.redfern.java_course_spring_2021.SpringBootWebApp2.DAO.CourseDAO;
import com.redfern.java_course_spring_2021.SpringBootWebApp2.Model.Course;

@Controller
public class CourseController {

	@Autowired
	CourseDAO courseDAO;
	
	@RequestMapping("/course")
	public String course() {
		return "course.jsp";
	}
	
	
	
	
	
	
	
	
	
	@RequestMapping("/addCourse")
	public String addCourse(Course course) {
		courseDAO.save(course);
		return "course.jsp";
	}
}
