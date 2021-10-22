package com.keerthuk.cms.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keerthuk.cms.entities.Course;

@RestController
public class CourseController {
	@GetMapping("/courses")
	public String ListAllCourse() {
		return "ListAllCourse";
	}
	@GetMapping ("/course")
	public String getByCourse() {
		return "getByCourse";
	}
	

}
