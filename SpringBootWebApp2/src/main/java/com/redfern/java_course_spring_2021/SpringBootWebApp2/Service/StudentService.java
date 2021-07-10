package com.redfern.java_course_spring_2021.SpringBootWebApp2.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redfern.java_course_spring_2021.SpringBootWebApp2.DAO.StudentRepo;
import com.redfern.java_course_spring_2021.SpringBootWebApp2.Exception.ResourceNotFoundException;
import com.redfern.java_course_spring_2021.SpringBootWebApp2.Model.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo studentRepo;

	public List<Student> findAll() {
		List<Student> students = studentRepo.findAll();
		return students;
	}

	public Student save(Student student) {
		return studentRepo.saveAndFlush(student);
	}

	public Student findById(Long id) {
		return studentRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + id));
	}

	public void delete(Student student) {
		studentRepo.delete(student);
	}

}
