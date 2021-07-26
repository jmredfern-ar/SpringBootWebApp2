package com.redfern.java_course_spring_2021.SpringBootWebApp2.Model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CourseTest {
	
	public static Course course1;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		course1 = new Course();
	}

	@Test
	void setId_GivenLong_ShouldReturnLong() {
		Long id = 777L;
		course1.setId(id);
		assertEquals(course1.getId(), id);
	}

	@Test
	void setName_GivenString_ShouldReturnString() {
		String str = "Stephen Strange's Intro to Street Magick";
		course1.setName(str);
		assertEquals(course1.getName(), str);
	}

}
