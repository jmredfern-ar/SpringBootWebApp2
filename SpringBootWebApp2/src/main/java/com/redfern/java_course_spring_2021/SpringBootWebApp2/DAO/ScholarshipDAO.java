package com.redfern.java_course_spring_2021.SpringBootWebApp2.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redfern.java_course_spring_2021.SpringBootWebApp2.Model.Scholarship;

public interface ScholarshipDAO extends JpaRepository<Scholarship, Long> {

}
