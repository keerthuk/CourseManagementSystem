package com.keerthuk.cms.entities;

import java.util.Arrays;

public class User {
	private int userId;
	private String userName;
	private boolean isAdmin;
	private String phnNo;
	private String email;
	private String password;
	private Course course;
	
	
// Constructor
	
	public User(int userId, String userName, boolean isAdmin, String phnNo, String email, String password, Course course ) {
		this.userId = userId;
		this.userName = userName;
		this.isAdmin = isAdmin;
		this.phnNo = phnNo;
		this.email = email;
		this.password = password;
		this.course = course;
	}
public User() {
		super();
		// TODO Auto-generated constructor stub
	}
public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public void setPhnNo(String phnNo) {
		this.phnNo = phnNo;
	}
	// Getters
	public int getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public boolean getIsAdmin() {
		return isAdmin;
	}

	public String getPhnNo() {
		return phnNo;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
		
	}
// Setters
	public void setUserId(int userId) {
		this.userId=userId;
	}
	public void setUserName(String userName) {
		this.userName=userName;
	}
	public void setIsAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public void setPhnno(String phnNo) {
		this.phnNo=phnNo;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", isAdmin=" + isAdmin + ", phnNo=" + phnNo + ", email=" + email + ", course=" + course + "]";
	}
	

	
	
}
