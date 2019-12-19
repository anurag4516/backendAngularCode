package com.cloudpassion.microservices.restfulwebservice.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

//Using Component as we are only communicating to Array List Not Exact Database
@Component
public class UserDaoService {

	private static List<User> user = new ArrayList<User>();
	public  int userCount;
	public int getUserCount() {
		return userCount;
	}
	public void setUserCount(int userCount) {
		this.userCount = userCount;
	}
	static {
		user.add(new User(1, "Anurag", new Date()));
		user.add(new User(2, "Gupta", new Date()));
		user.add(new User(3, "Darshi", new Date()));
		user.add(new User(4, "Guptan", new Date()));
		user.add(new User(5, "Mani", new Date()));
		user.add(new User(6, "Guptanu", new Date()));
		
	}
	public List<User> findAll()
	{
		return user;
	}
	public List<User> save(User users)
	{
		if(users.getId()==null) {users.setId(getUserCount());setUserCount(getUserCount()+1);}
		user.add(users);
	return user;    	
	}
	public User findOne(int id)
	{
		for(User us:user)
		{
			if(us.getId()==id) {return us;}
		}
		return null;
	}
	
	public User deleteOne(int id)
	{
		Iterator<User>itr =user.iterator();
		while(itr.hasNext())
		{
			User us =itr.next();
			if(us.getId()==id) {itr.remove();return us;}
		}
		return null;
	}
	
}
