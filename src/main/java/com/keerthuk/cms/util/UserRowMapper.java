package com.keerthuk.cms.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.keerthuk.cms.entities.Course;
import com.keerthuk.cms.entities.User;

public class UserRowMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		
		user.setUserId(rs.getInt(1));
		user.setUserName(rs.getString(2));
		user.setIsAdmin(rs.getBoolean(3));
		user.setPhnno(rs.getString(4));
		user.setEmail(rs.getString(5));
		user.setPassword(rs.getString(6));

		
		
		return user;
	}

}
