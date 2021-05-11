package com.redfern.java_course_spring_2021.SpringBootWebApp2;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redfern.java_course_spring_2021.SpringBootWebApp2.Model.Student;

@SpringBootApplication
public class SpringBootWebApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApp2Application.class, args);
	}
}
