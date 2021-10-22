package com.keerthuk.cms.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.keerthuk.cms.entities.User;
import com.keerthuk.cms.service.UserService;

@RestController

public class UserController {
	@Autowired
	private UserService userServiceObj;
	
	
	@GetMapping("/users")
	public String ListOfUsers() {

		return "users";
	}
	
	@PostMapping("/user")
	public String createUser(@RequestBody User user) {
		System.out.println(user.toString());
		return "Successfully created user";
	}
	@GetMapping("/userlist")
	public List<User> getByUsers() {
		return userServiceObj.allUsers();
		
	}
	

}
