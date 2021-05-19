package com.redfern.java_course_spring_2021.SpringBootWebApp2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redfern.java_course_spring_2021.SpringBootWebApp2.DAO.CourseDAO;
import com.redfern.java_course_spring_2021.SpringBootWebApp2.Model.Course;
import com.redfern.java_course_spring_2021.SpringBootWebApp2.Model.Student;

@Service
public class CourseService {
	
	@Autowired
	private CourseDAO courseDAO;
	
	public List<Course> findAll() {
		List<Course> courses = courseDAO.findAll();
		return courses;
	}

}
