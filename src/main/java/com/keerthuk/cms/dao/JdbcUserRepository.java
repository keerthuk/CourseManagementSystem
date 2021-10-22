package com.keerthuk.cms.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.keerthuk.cms.entities.User;
import com.keerthuk.cms.util.UserRowMapper;

@Repository
public class JdbcUserRepository implements UserRepository {
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Override
    public List<User> displayAllUser() {
        List<User> users = new ArrayList<User>();
        users.add(jdbcTemplate.queryForObject("select * from user",new UserRowMapper()));
        
        return users;
    }

	
}
