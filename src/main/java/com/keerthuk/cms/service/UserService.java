package com.keerthuk.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keerthuk.cms.dao.JdbcUserRepository;
import com.keerthuk.cms.dao.UserRepository;
import com.keerthuk.cms.entities.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepository usersRepo;
	
	public List<User> allUsers() {
		return usersRepo.displayAllUser();
	}

}


