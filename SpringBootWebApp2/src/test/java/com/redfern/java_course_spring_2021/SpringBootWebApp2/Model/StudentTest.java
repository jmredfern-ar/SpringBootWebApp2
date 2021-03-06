package com.redfern.java_course_spring_2021.SpringBootWebApp2.Model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class StudentTest {
	
	public static Student s0;
	public static Student s1;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		s0 = new Student();
		s1 = new Student(999L, "Black Widow", "bw@bdubs.rs", 30);
	}

	@Test
	void setId_GivenLong_ShouldReturnLong() {
		Long id = new Long(888L);
		s0.setId(id);
		assertEquals(s0.getId(), id);
	}

	@Test
	void setAge_GivenInt_ShouldReturnInt() {
		s0.setAge(11);
		assertEquals(s0.getAge(), 11);
	}

}
