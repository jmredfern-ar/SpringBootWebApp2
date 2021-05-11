package com.redfern.java_course_spring_2021.SpringBootWebApp2.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.redfern.java_course_spring_2021.SpringBootWebApp2.Model.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Long> {

}
