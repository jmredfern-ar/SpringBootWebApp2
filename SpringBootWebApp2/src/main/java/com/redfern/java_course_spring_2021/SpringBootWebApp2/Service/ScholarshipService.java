package com.redfern.java_course_spring_2021.SpringBootWebApp2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redfern.java_course_spring_2021.SpringBootWebApp2.DAO.ScholarshipDAO;
import com.redfern.java_course_spring_2021.SpringBootWebApp2.Exception.ResourceNotFoundException;
import com.redfern.java_course_spring_2021.SpringBootWebApp2.Model.Course;
import com.redfern.java_course_spring_2021.SpringBootWebApp2.Model.Scholarship;

@Service
public class ScholarshipService {
	
	@Autowired
	ScholarshipDAO scholarshipDAO;

	public List<Scholarship> findAll() {
		return scholarshipDAO.findAll();
	}

	public Scholarship findById(Long id) {
		return scholarshipDAO.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Scholarship not found with id: " + id));
	}
	
	// NEW
	public Scholarship findScholarshipByName(String name) {
		return scholarshipDAO.findScholarshipByName(name).get(0);
	}

	public Scholarship findScholarshipByIdAndName(Long id, String name) {
		return scholarshipDAO.findScholarshipByIdAndName(id, name).get(0);
	}

	public Scholarship findScholarshipByIdAndStudent(Long id, String student) {
		return scholarshipDAO.findScholarshipByIdAndStudent(id, student).get(0);
	}
}
