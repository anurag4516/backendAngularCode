package com.cloudpassion.microservices.restfulwebservice.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
// Controller is something that says it can accept http req
@RestController
public class HelloWorldController {
	// Get Service to print Hello-World
	// Request Mapping states what should be mapped to rest controller
	@GetMapping(path = "/hello-world")
	public String helloWorld()
	{
		return "Hello World";
	}
	
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean()
	{
		return new HelloWorldBean("Bean");
	}

	@GetMapping(path = "/hello-world-bean/path/{variable}")
	public HelloWorldBean helloWorldBeanPath(@PathVariable String variable)
	{
		return new HelloWorldBean(String.format("Bean %s",variable));
	}


}
