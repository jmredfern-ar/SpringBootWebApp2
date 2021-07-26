package com.redfern.java_course_spring_2021.SpringBootWebApp2.Model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ScholarshipTest {
	
	public static Scholarship sch0;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		sch0 = new Scholarship();
	}

	@Test
	//MethodName_StateUnderTest_ExpectedBehavior
	void setId_GivenLong_ShouldReturnLong() {
		sch0.setId(201L);
		assertEquals(sch0.getId(), 201L);
	}

	@Test
	void setName_GivenString_ShouldReturnString() {
		String str1 = "Stephen Strange Mystic Arts Award";
		sch0.setName(str1);
		assertEquals(sch0.getName(), str1);
	}

	@Test
	void setAmount_GivenInt_ShouldReturnInt() {
		int amt = 19009;
		sch0.setAmount(amt);
		assertEquals(sch0.getAmount(), amt);
	}

}
