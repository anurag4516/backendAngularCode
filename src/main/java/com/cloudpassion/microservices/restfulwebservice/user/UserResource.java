package com.cloudpassion.microservices.restfulwebservice.user;

import java.util.Iterator;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserResource {
	
	@Autowired
	private UserDaoService daoService;
	
	@GetMapping("/users")
	public List<User> retrieveAll()
	{
		return daoService.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User getUser(@PathVariable int id)
	{
		User use =daoService.findOne(id);
		if(use==null)
		{
			throw new UserNotFoundException("id" +id);
		}
		return use;
	}
	@PostMapping("/users")
	public  User createUser(@Valid @RequestBody User user)
	{
		daoService.save(user);
		
		return user;
	}
	
	// Deleting Resource
	@DeleteMapping("/users/{id}")
	public User deleteUser(@PathVariable int id)
	{
		User use =daoService.deleteOne(id);
		if(use==null)
		{
			throw new UserNotFoundException("id" +id);
		}
		 
		return use;
	}
	
	/*
	 * Retrive All Posts----- Get  /users/{id}/posts
	 * Create All Posts -----Post  /users/{id}/posts
	 * Retrieve Details of Post--- Get /users/{id}/posts/{post_id}
	 * 
	 */

}
