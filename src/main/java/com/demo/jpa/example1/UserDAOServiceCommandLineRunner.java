package com.demo.jpa.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.demo.jpa.example1.entity.User;
import com.demo.jpa.example1.service.UserDAOService;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner{

	private static final Logger log = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
	
	@Autowired
	private UserDAOService userDAOService;
	
	public void run(String... arg0) throws Exception{
		User user = new User("Jack", "Admin");
		
		long insert = userDAOService.insert(user);
		
		log.info("New User is Created :{}" + user);
	}
}
