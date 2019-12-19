package com.cloudpassion.microservices.restfulwebservice.user;

import java.sql.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class User {

	private Integer id;
	@Size(min = 2)
	private String name;
	
	private java.util.Date birthDay;
	
	protected User() {
		
	}
	
	public User(Integer id, String name, java.util.Date date) {
		super();
		this.id = id;
		this.name = name;
		this.birthDay =  date;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public java.util.Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthDay=" + birthDay + "]";
	}
	
	
}
