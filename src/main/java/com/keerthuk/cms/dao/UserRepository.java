package com.keerthuk.cms.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.keerthuk.cms.entities.User;

@Repository
public interface UserRepository {
	public List<User> displayAllUser();
	
	

}
