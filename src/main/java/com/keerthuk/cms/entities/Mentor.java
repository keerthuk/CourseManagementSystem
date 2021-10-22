package com.keerthuk.cms.entities;

public class Mentor {
	
	private int mentorId;
	private User user;
	private String skills;
	
	
// Constructor	
	Mentor(int mentorId, User user, String skills){
		this.mentorId=mentorId;
		this.user=user;
		this.skills=skills;
	}
	
	public int getMentorId() {
		return mentorId;
	}
	public User getUser() {
		return user;
	}
	public String getSkills() {
		return skills;
	}
// Setters
	public void setMentorId(int mentorId) {
		this.mentorId=mentorId;
		
	}
	public void setUser(User user) {
		this.user=user;
	}
	public void setSkills(String skills) {
		this.skills=skills;
	}
	

}
