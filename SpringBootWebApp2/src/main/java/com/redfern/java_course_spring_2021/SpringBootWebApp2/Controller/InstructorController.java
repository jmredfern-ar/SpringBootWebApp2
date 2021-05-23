package com.redfern.java_course_spring_2021.SpringBootWebApp2.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redfern.java_course_spring_2021.SpringBootWebApp2.Model.Instructor;
import com.redfern.java_course_spring_2021.SpringBootWebApp2.Service.InstructorService;

@RestController
public class InstructorController {
	
	@Autowired
	private InstructorService instructorService;
	 
	@RequestMapping("api/v1/instructor") 
	public List<String> getInstructors(){
		List<Instructor> instructors = instructorService.findAll();
		List<String> names = new ArrayList<String>();
		for(Instructor instructor : instructors) {
			names.add(instructor.getName());
		}
		return names;
	}
	
	
	

}
