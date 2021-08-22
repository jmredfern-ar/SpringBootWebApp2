package com.redfern.java_course_spring_2021.SpringBootWebApp2.DAO;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.redfern.java_course_spring_2021.SpringBootWebApp2.Model.Course;

@DataJpaTest
class CourseDAOTest2 {
	
	@Autowired
	CourseDAO courseDAO;
	private List<Course> courseList;

	@Test
	//name of method_Given<something>_ShouldReturn<something>()
	void findCourse_GivenNoParams_ShouldReturnList() {
		courseList = courseDAO.findCourses();
		System.out.println("findCourse() courseList: " + courseList);
		assertNotNull(courseList);
		assertEquals(4, courseList.size());
	}
	
	@Test
	void findCourseById_GivenId_ShouldReturnList() {
		courseList = courseDAO.findCourseById();
		System.out.println("findCourseById() courseList: " + courseList);
		assertNotNull(courseList);
		assertEquals(401, courseList.get(0).getId());
	}
	
	@Test
	void findCourseByDepartment_GivenDepartment_ShouldReturnList() {
		courseList = courseDAO.findCourseByDepartment("FACS");
		assertNotNull(courseList);
		assertEquals("FACS", courseList.get(0).getDepartment());
	}
	
	@Test
	void findCourseByIdAndDepartment_GivenIdAndDepartment_ShouldReturnList() {
		Long id = 401L;
		String department = "FACS";
		
		courseList = courseDAO.findCourseByIdAndDepartment(id, department);
		assertNotNull(courseList);
		assertEquals(id, courseList.get(0).getId());
		assertEquals(department, courseList.get(0).getDepartment());
	}
}
