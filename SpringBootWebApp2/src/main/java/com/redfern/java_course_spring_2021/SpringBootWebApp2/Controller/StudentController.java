package com.redfern.java_course_spring_2021.SpringBootWebApp2.Controller;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/students/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
		Student student = studentService.findById(id);
		return ResponseEntity.ok(student);
	}
	
	// PUT REQUEST IS USED TO MODIFY AN EXISTING RECORD
	@PutMapping("/students/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student studentDetails) {
		
		// STEP ONE: RETRIEVE STUDENT RECORD FROM THE DATABASE USING ID
		Student student = studentService.findById(id);
		
		// STEP TWO: UPDATE RETRIEVED STUDENT WITH NEW STUDENT DETAILS FROM FRONT END
		student.setName(studentDetails.getName());
		student.setEmail(studentDetails.getEmail());
		student.setDob(studentDetails.getDob());
		student.setAge(studentDetails.getAge());
		
		// STEP THREE: SAVE THE MODIFIED STUDENT RECORDD TO THE DB
		Student updatedStudent = studentService.save(student);
		
		// RETURN A RESPONSE CONTAINING OK AND THE UPDATED STUDENT RECORD
		return ResponseEntity.ok(updatedStudent);
	}
	
	// DELETE REQUEST IS USED TO DELETE AN EXISTING STUDENT RECORD
	@DeleteMapping("/students/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteStudent(@PathVariable Long id) {
		
		// STEP ONE: RETRIEVE STUDENT RECORD FROM THE DATABASE USING ID
		Student student = studentService.findById(id);
		
		// STEP TWO: USE CALL SERVICE'S DELETE METHOD
		studentService.delete(student);
		
		// STEP THREE: CREATE A HASHMAP TO HOLD A MSG (KEY) AND TRUE (VALUE)
		Map<String, Boolean> response = new HashMap<String, Boolean>();
		response.put("deleted", Boolean.TRUE);
		
		// RETURN MAP INSIDE RESPONSE ENTITY
		return ResponseEntity.ok(response);
	}
}
