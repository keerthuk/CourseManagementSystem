package com.keerthuk.cms.entities;


public class Course {
	
	private int courseId;
	private String courseName; 

	
//  Constructor
	Course(int courseId, String courseName ){
		this.courseId=courseId;
		this.courseName=courseName;

	}
// Getters
	public int getCourseId() {
		return courseId;
	}
	public String getCourseName() {
		return courseName;
	}

// Setters
	public int setCourseId(int courseId) {
		return courseId;
	}
	public String setCourseName(String courseName) {
		return courseName;
	}

}
