package com.redfern.java_course_spring_2021.SpringBootWebApp2.Model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class StudentTest {
	
	public static Student s0;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		s0 = new Student();
	}

	@Test
	void testStudentLongStringStringLocalDateInteger() {
		fail("Not yet implemented");
	}

	@Test
	void testSetAge() {
		s0.setAge(11);
		assertEquals(s0.getAge(), 11);
	}

}
