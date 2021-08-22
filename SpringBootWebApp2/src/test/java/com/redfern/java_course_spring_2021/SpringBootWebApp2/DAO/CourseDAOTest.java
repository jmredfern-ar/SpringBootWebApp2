package com.redfern.java_course_spring_2021.SpringBootWebApp2.DAO;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.redfern.java_course_spring_2021.SpringBootWebApp2.Model.Course;

@DataJpaTest
class CourseDAOTest {
	
	@Autowired
	private CourseDAO courseDAO;
	private List<Course> courseList;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	//setId_GivenLong_ShouldReturnLong
	void findCourse_GivenNoParams_ShouldReturnList() {
		courseList = courseDAO.findCourses();
//		System.out.println(courseList);
		assertNotNull(courseList);
	}
	
	@Test
	void findCourse_GivenId_ShouldReturnList() {
		courseList = courseDAO.findCourseById();
//		System.out.println("CourseList size " + courseList.size());
		assertEquals(1, courseList.size());
	}
	
	@Test
	void findCourse_GivenName_ShouldReturnList() {
		courseList = courseDAO.findCourseByName("Underwater Basket Weaving");
		assertEquals(1, courseList.size());
		
//		System.out.println("Course: " + courseList.get(0));
		assertEquals("Underwater Basket Weaving", courseList.get(0).getName());
	}

	@Test
	void findCourse_GivenDepartment_ShouldReturnList() {
		courseList = courseDAO.findCourseByDepartment("FACS");
		assertEquals("FACS", courseList.get(0).getDepartment());
	}
	
	@Test
	void findCourse_GivenIdAndDepartment_ShouldReturnList() {
		courseList = courseDAO.findCourseByIdAndDepartment(402L, "Kinesiology");
		System.out.println("Course: " + courseList.get(0));
		assertEquals(1, courseList.size());
	}

}
