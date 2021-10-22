package com.keerthuk.cms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@ComponentScan({ "com.keerthuk.cms" })
public class CourseManagementSystemApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(CourseManagementSystemApplication.class);

	@Autowired
	JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(CourseManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		runJDBC();

	}

	void runJDBC() {
		log.info("Creating tables for testing...");
		jdbcTemplate.execute("CREATE TABLE  IF NOT EXISTS course(course_id int Primary Key, course_name VARCHAR(255))");
		

		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS user(user_id int, user_name VARCHAR(255), is_admin boolean(5), phn_no VARCHAR(10), email VARCHAR(100), password VARCHAR(20), course_id int, PRIMARY KEY (user_id), FOREIGN key(course_id) REFERENCES course(course_id))");
		
		
		


//		log.info("[SAVE]");
//		jdbcTemplate.update("insert into temp (name) values(?)", "Gokul-BOOK");
//
//		int count = jdbcTemplate.queryForObject("select count(*) from temp", Integer.class);
//		log.info("[COUNT] Total books: {}", count);

	}

}
