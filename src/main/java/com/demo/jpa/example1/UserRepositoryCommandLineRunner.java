package com.demo.jpa.example1;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.demo.jpa.example1.entity.User;
import com.demo.jpa.example1.repository.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... arg0) throws Exception {
		User user = new User("Jill", "Admin");

		userRepository.save(user);
		Optional<User> userWithIdOne = userRepository.findById(1L);

		log.info("New User is retrieved :{}" + user);
		
		List<User> users = userRepository.findAll();
		log.info("All Users : "+ users);
		
	}
}
