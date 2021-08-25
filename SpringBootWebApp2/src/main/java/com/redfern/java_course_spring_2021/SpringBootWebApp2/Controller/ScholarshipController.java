package com.redfern.java_course_spring_2021.SpringBootWebApp2.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/scholarships")
	public ResponseEntity<List<Scholarship>> getScholarships(@RequestParam(required = false) Map<String, String> allParams) {
		
		List<Scholarship> scholarships = null;
		
		if(allParams.isEmpty()) { // SENT NO PARAMS
			
			scholarships = scholarshipService.findAll(); // CALLED IF NO PARAMS, BUT NOT WRONG PARAMS
			return ResponseEntity.ok(scholarships); 
		
		} else { 
			
			// LOCAL VARS
			Long id = null;
			String name = null, student = null;
			scholarships = new ArrayList<Scholarship>();
			
			// INITIALIZE LOCAL VARS FROM PARAMS, NULL IF MISSING
			if(allParams.containsKey("id")) 
				id = Long.parseLong(allParams.get("id"));
			if(allParams.containsKey("name"))
				name = allParams.get("name");
			if(allParams.containsKey("student"))
				student = allParams.get("student");
				
			// ROUTE TO CORRECT SERVICE METHOD
			if(id != null && name == null) { //?id=123
				scholarships.add(scholarshipService.findById(id));
			} else if(id == null && name != null) {//?name=Hank+Pym
				scholarships.add(scholarshipService.findScholarshipByName(name));
			} else if(id != null && name != null) {//?id=123&name=Tony+Stark+Iron+Person+Award
				scholarships.add(scholarshipService.findScholarshipByIdAndName(id, name));
			} else if(id != null && student != null) { 
				scholarships.add(scholarshipService.findScholarshipByIdAndStudent(id, student));
			}
			
			return ResponseEntity.ok(scholarships);
		}
	}
	
	@GetMapping("/scholarships/{id}")
	public ResponseEntity<Scholarship> getStudentById(@PathVariable Long id) {
		Scholarship scholarship = scholarshipService.findById(id);
		return ResponseEntity.ok(scholarship);
	}
	
	
}
