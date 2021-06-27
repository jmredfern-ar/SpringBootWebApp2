package com.redfern.java_course_spring_2021.SpringBootWebApp2.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redfern.java_course_spring_2021.SpringBootWebApp2.Model.Instructor;
import com.redfern.java_course_spring_2021.SpringBootWebApp2.Service.InstructorService;

//@Controller
@RestController
@RequestMapping("api/v1")
public class InstructorController {
	
	@Autowired
	private InstructorService instructorService;
	 
	@PostMapping("/instructor")
	public void saveInstructor(@RequestBody Instructor instructor) {
		System.out.println("Calling saveInstructor()...");
		instructorService.saveInstructor(instructor);
//		return "instructor-list.html";
	}
	
	@GetMapping("/instructor/{id}")
	public String findInstructorById(Model model, @PathVariable(value = "id") Long instructorId) {
		
		Instructor instructor = null;
		
		try {
			instructor = instructorService.findInstructorById(instructorId);
		} catch(Exception e) {
			String errorMessage = e.getMessage();
			model.addAttribute("errorMessage", errorMessage);
		}
		
		model.addAttribute("instructor", instructor);
		return "instructor";
	}
	
	@GetMapping("/instructors")
//	public String getInstructors(){
	public List<Instructor> getInstructors() {
		List<Instructor> instructors = instructorService.findAll();
//		List<String> names = new ArrayList<String>();
//		for(Instructor instructor : instructors) {
//			names.add(instructor.getName());
//		}
		return instructors;
//		return "instructor-list.html"; //names;
	}
}
