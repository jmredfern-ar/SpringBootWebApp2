package com.redfern.java_course_spring_2021.SpringBootWebApp2.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redfern.java_course_spring_2021.SpringBootWebApp2.DAO.InstructorDAO;
import com.redfern.java_course_spring_2021.SpringBootWebApp2.Model.Instructor;

@Service
public class InstructorService {
	
	@Autowired
	private InstructorDAO instructorDAO;
	
	public List<Instructor> findAll() {
		return instructorDAO.findAll();
	}

	public Instructor saveInstructor(Instructor instructor) {
		return instructorDAO.save(instructor);
	}

	public Instructor findInstructorById(Long id) throws Exception {
		Instructor instructor = instructorDAO.findById(id).orElse(null);
		if(instructor == null) {
			throw new Exception("Cannot find Instructor with id: " + id);
		}
		else
			return instructor;
	}

}
