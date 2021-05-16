package com.redfern.java_course_spring_2021.SpringBootWebApp2.Controller;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redfern.java_course_spring_2021.SpringBootWebApp2.DAO.StudentRepo;
import com.redfern.java_course_spring_2021.SpringBootWebApp2.Model.Student;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepo sRepo;
	
//	private final StudentService studentService;
//
//	@Autowired
//	public StudentController(StudentService studentService) {
//		super();
//		this.studentService = studentService;
//	}

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

	@RequestMapping("/addStudent")
	public String addStudent(Student student) {
		sRepo.save(student);
		System.out.println("Saving..." + student);
		return "home.jsp";
	}

}
