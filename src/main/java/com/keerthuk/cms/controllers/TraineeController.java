package com.keerthuk.cms.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.keerthuk.cms.entities.Trainee;

@RestController
public class TraineeController {
	@GetMapping("/trainees")
	public String ListOfTrainees() {
		return "ListOfTrainees";
	}
	
	// /trainee?id=202
	@GetMapping("/trainee")
	public String getByTrainee(@RequestParam int id) {
		System.out.println("given id :: "+id);
		return "getByTrainee";
	}
	@PostMapping("/trainee")
	public String AddTrainee(@RequestBody Trainee trainee) {
		return "AddTrainee";
	}
	
	@PutMapping("/trainee")
	public String updateTrainee() {
		return "updateTrainee";
	}
	
	// /trainee/203
	@DeleteMapping("/trainee/{id}")
	public String DeleteTrainee(@PathVariable int id) {
		
		return "DeleteTrainee";
	}

}
