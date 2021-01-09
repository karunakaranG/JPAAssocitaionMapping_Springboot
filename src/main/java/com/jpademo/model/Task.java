package com.jpademo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int tid;
	private String taskName;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "tasks")
	private Set<User>users=new HashSet<User>();
	
	public Task() {
		
	}

	public Task(String taskName) {
		super();
		this.taskName = taskName;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	

	
	
	

}
