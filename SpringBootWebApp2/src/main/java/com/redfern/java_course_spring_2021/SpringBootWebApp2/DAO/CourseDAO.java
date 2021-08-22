package com.redfern.java_course_spring_2021.SpringBootWebApp2.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.redfern.java_course_spring_2021.SpringBootWebApp2.Model.Course;

@Repository
public interface CourseDAO extends JpaRepository<Course, Long> {
	
	@Query("SELECT c FROM course c")
	abstract List<Course> findCourses(); 
	
	@Query("SELECT c from course c WHERE c.id=401")
	List<Course> findCourseById();

	@Query("SELECT c FROM course c WHERE c.name = ?1")
	List<Course> findCourseByName(String name);

	@Query("SELECT c FROM course c WHERE c.department=?1")
	List<Course> findCourseByDepartment(String department);

	@Query("SELECT c from course c WHERE c.id=?1 AND c.department = ?2")
	List<Course> findCourseByIdAndDepartment(Long id, String department);

}
