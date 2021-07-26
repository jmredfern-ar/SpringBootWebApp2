package com.redfern.java_course_spring_2021.SpringBootWebApp2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redfern.java_course_spring_2021.SpringBootWebApp2.DAO.ScholarshipDAO;
import com.redfern.java_course_spring_2021.SpringBootWebApp2.Exception.ResourceNotFoundException;
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

}
