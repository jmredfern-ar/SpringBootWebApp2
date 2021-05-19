package com.redfern.java_course_spring_2021.SpringBootWebApp2.Controller;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redfern.java_course_spring_2021.SpringBootWebApp2.DAO.StudentRepo;
import com.redfern.java_course_spring_2021.SpringBootWebApp2.Model.Course;
import com.redfern.java_course_spring_2021.SpringBootWebApp2.Model.Student;
import com.redfern.java_course_spring_2021.SpringBootWebApp2.Service.CourseService;
import com.redfern.java_course_spring_2021.SpringBootWebApp2.Service.StudentService;

@Controller
public class StudentController {
	
	//@Autowired
	//StudentRepo sRepo;
	
	// REINSTATE WHEN YOU MIGRATE BIZ LOGIC TO THE SERVICE
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private CourseService courseService;
	
//
//	@Autowired
//	public StudentController(StudentService studentService) {
//		super();
//		this.studentService = studentService;
//	}

	// ORIG LANDING PAGE FOR STUDENT
//	@RequestMapping("api/v1/student")
//	public String home() {
//		return "student.html";
//	}

	@RequestMapping("api/v1/student")
	public String getStudents(Model model) {
		List<Student> students = studentService.findAll();
		List<Course> courses = courseService.findAll();
		System.out.println(Arrays.toString(students.toArray()));
		System.out.println(Arrays.toString(courses.toArray()));
		model.addAttribute("students", students);
		model.addAttribute("courses", courses);
		return "student-list.html";
	}
	
//	@RequestMapping("api/v1/addStudent")
//	public String addStudent(Student student) {
//		//sRepo.save(student);
//		return "student.html";
//	}
}
