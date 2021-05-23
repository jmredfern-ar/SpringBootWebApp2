package com.redfern.java_course_spring_2021.SpringBootWebApp2.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {
	
	@Id
	private Long id;
	private String name;
	private String department;
	//private String instructor;

	@ManyToOne
    private Student student;
	
	@ManyToOne
	private Instructor instructor;
	
	// CONSTRUCTORS
	public Course() {
		super();
	}	
	
//	public Course(Long id, String name, String department, String instructor) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.department = department;
//		this.instructor = instructor;
//	}
	
	public Course(Long id, String name, String department, Student student, Instructor instructor) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.student = student;
		this.instructor = instructor;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public String getInstructor() {
//		return instructor;
//	}
//
//	public void setInstructor(String instructor) {
//		this.instructor = instructor;
//	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", major=" + department + ", instructor=" + instructor + "]";
	}
}
