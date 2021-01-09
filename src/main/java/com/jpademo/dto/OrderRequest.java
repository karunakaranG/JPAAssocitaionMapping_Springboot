package com.jpademo.dto;

import java.util.List;

import com.jpademo.model.User;


public class OrderRequest {

	private List<User> user;
	
	public OrderRequest(){
		
	}

	public OrderRequest(List<User> user) {
		super();
		this.user = user;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "OrderRequest [user=" + user + "]";
	}

	
	
}
