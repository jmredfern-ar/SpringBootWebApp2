package com.redfern.java_course_spring_2021.SpringBootWebApp2.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.redfern.java_course_spring_2021.SpringBootWebApp2.Model.Instructor;

@Repository
public interface InstructorDAO extends JpaRepository<Instructor, Long> {
	
	//Installed @ 15:00 
//	Instructor findByInstructorId(Long instructorId);

}
