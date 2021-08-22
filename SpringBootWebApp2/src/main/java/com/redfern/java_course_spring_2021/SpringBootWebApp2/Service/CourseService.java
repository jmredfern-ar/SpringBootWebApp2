package com.redfern.java_course_spring_2021.SpringBootWebApp2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redfern.java_course_spring_2021.SpringBootWebApp2.DAO.CourseDAO;
import com.redfern.java_course_spring_2021.SpringBootWebApp2.Exception.ResourceNotFoundException;
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
	
//	public Student findById(Long id) {
//		return studentRepo.findById(id)
//				.orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + id));
//	}

	public Course findCourseByDepartment(String department) {
		return courseDAO.findCourseByDepartment(department).get(0);
//				.orElseThrow(()-> new ResourceNotFoundException("Course not found with department: " + department));
	}

}
