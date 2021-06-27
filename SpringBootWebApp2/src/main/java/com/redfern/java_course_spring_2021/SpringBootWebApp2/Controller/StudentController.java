package com.redfern.java_course_spring_2021.SpringBootWebApp2.Controller;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redfern.java_course_spring_2021.SpringBootWebApp2.DAO.StudentRepo;
import com.redfern.java_course_spring_2021.SpringBootWebApp2.Model.Course;
import com.redfern.java_course_spring_2021.SpringBootWebApp2.Model.Student;
import com.redfern.java_course_spring_2021.SpringBootWebApp2.Service.CourseService;
import com.redfern.java_course_spring_2021.SpringBootWebApp2.Service.StudentService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		return studentService.findAll();
	}
	
	@PostMapping("/students")
	public Student createStudent(@RequestBody Student student) {
		return studentService.save(student);
	}
	
//	public String getStudents(Model model) {
//		List<Student> students = studentService.findAll();
//		List<Course> courses = courseService.findAll();
//		System.out.println(Arrays.toString(students.toArray()));
//		System.out.println(Arrays.toString(courses.toArray()));
//		model.addAttribute("students", students);
//		model.addAttribute("courses", courses);
//		return "student-list.html";
//	}
	
}
