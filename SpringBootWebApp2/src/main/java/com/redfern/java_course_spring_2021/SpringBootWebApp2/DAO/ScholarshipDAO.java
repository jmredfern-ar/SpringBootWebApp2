package com.redfern.java_course_spring_2021.SpringBootWebApp2.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.redfern.java_course_spring_2021.SpringBootWebApp2.Model.Scholarship;

public interface ScholarshipDAO extends JpaRepository<Scholarship, Long> {
		
	@Query("SELECT s FROM scholarship s WHERE s.name=?1")
	List<Scholarship> findScholarshipByName(String name);
	
	@Query("SELECT s FROM scholarship s WHERE s.id=?1 AND s.name=?2")
	List<Scholarship> findScholarshipByIdAndName(Long id, String name);
	
	
	//findAll();
	//findById();
	
	
	
	
	String str = "SELECT s FROM scholarship s WHERE s.id=123";
//	String str = "select sch from scholarship sch \n" + 
//		         "join student_scholarships s_s on sch.id = s_s.scholarships_id \n" + 
//			     "join student stu \n" + 
//				 "on stu.id = s_s.students_id \n" + 
//				 "where sch.id=?1 \n" +
//				 "AND stu.name=?2 \n";  
	
	@Query(str)
	List<Scholarship> findScholarshipByIdAndStudent(Long id, String student);
	
}
