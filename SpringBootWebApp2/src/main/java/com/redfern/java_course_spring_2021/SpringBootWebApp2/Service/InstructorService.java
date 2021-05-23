package com.redfern.java_course_spring_2021.SpringBootWebApp2.Service;

import java.util.List;

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

}
