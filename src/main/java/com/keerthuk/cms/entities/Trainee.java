package com.keerthuk.cms.entities;

import java.util.*;

public class Trainee {
	private int traineeId;
	private User user;
	private Course course;
	Date EnrollDate = new Date();

// Constructor
	Trainee(int traineeId, User user, Course course, Date EnrollDate) {
		this.traineeId = traineeId;
		this.user = user;
		this.course = course;
		this.EnrollDate = EnrollDate;
	}

// Getters
	public int getTraineeId() {
		return traineeId;
	}

	public User getUserId() {
		return user;
	}

	public Course getCourseId() {
		return course;
	}

	public Date getEnrollDate() {
		return EnrollDate;
	}

// Setters
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public void setEnrollDate(Date EnrollDate) {
		this.EnrollDate = EnrollDate;
	}

}
