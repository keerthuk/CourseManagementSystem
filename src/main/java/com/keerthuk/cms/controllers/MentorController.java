package com.keerthuk.cms.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keerthuk.cms.entities.Mentor;

@RestController
public class MentorController {
	@GetMapping("/mentors")
	public String ListAllMentor() {
		return "ListAllMentor";	
	}
	@GetMapping("/mentor")
	public String SearchByMentor() {
		return "SearchByMentor";	
	}
	@PostMapping("/mentor")
	public String AddMentor() {
		return "AddMentor";	
	}
	
	
	

}
