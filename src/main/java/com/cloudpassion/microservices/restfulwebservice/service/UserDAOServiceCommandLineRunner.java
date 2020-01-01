package com.cloudpassion.microservices.restfulwebservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cloudpassion.microservices.restfulwebservice.entity.User;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {

	@Autowired
	private UserDAOService userDAOService;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user = new User("Anurag","Admin");
		long id=userDAOService.insert(user);
		System.out.print("\t ID is created as New User \t" + id);
	}


}
