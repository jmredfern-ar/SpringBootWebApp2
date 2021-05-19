package com.redfern.java_course_spring_2021.SpringBootWebApp2.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.redfern.java_course_spring_2021.SpringBootWebApp2.Model.Course;

@Repository
public interface CourseDAO extends JpaRepository<Course, Long> {

}
