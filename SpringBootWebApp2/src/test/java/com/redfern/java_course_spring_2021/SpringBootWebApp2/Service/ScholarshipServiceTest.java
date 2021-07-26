package com.redfern.java_course_spring_2021.SpringBootWebApp2.Service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.redfern.java_course_spring_2021.SpringBootWebApp2.Model.Scholarship;

class ScholarshipServiceTest {
	
	public static ScholarshipService schServ0;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		schServ0 = new ScholarshipService();
	}

	@Test
	void findById_GivenInt_ReturnScholarship() {
		Long id = new Long(101L);
		assertEquals(schServ0.findById(id).getName(), "Hank Pym");
	}

}
