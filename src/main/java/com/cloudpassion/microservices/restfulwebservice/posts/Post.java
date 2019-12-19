package com.cloudpassion.microservices.restfulwebservice.posts;

import com.cloudpassion.microservices.restfulwebservice.user.User;

public class Post {
	
	private String post;
	private String postDetails;
	private Integer post_id;
	private User user;

	protected Post()
	{
		
	}

	public String getPost() {
		return post;
	}

	public String getPostDetails() {
		return postDetails;
	}

	public Integer getPost_id() {
		return post_id;
	}

	public User getUser() {
		return user;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public void setPostDetails(String postDetails) {
		this.postDetails = postDetails;
	}

	public void setPost_id(Integer post_id) {
		this.post_id = post_id;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Post(String post, String postDetails, Integer post_id, User user) {
		super();
		this.post = post;
		this.postDetails = postDetails;
		this.post_id = post_id;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Post [post=" + post + ", postDetails=" + postDetails + ", post_id=" + post_id + ", user=" + user + "]";
	}
	
	
	
}
