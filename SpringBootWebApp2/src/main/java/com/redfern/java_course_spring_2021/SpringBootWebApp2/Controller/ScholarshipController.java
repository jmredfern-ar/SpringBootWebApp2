package com.redfern.java_course_spring_2021.SpringBootWebApp2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redfern.java_course_spring_2021.SpringBootWebApp2.Model.Scholarship;
import com.redfern.java_course_spring_2021.SpringBootWebApp2.Model.Student;
import com.redfern.java_course_spring_2021.SpringBootWebApp2.Service.ScholarshipService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("api/v1")
public class ScholarshipController {
	
	@Autowired
	ScholarshipService scholarshipService;
	
//	@GetMapping("scholarships")
//	public String listScholarships(Model model) {
//		List<Scholarship> scholarships = scholarshipService.findAll();
//		model.addAttribute("scholarships", scholarships);
//		return "scholarship-list.html";
//		
//	}

	// ADDED FINDALL()
	@GetMapping("/scholarships")
	public List<Scholarship> getScholarships() {
		return scholarshipService.findAll();
	}
	
	@GetMapping("/scholarships/{id}")
	public ResponseEntity<Scholarship> getStudentById(@PathVariable Long id) {
		Scholarship scholarship = scholarshipService.findById(id);
		return ResponseEntity.ok(scholarship);
	}
}
