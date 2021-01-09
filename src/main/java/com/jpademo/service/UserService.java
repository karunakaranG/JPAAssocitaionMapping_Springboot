package com.jpademo.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpademo.model.User;
import com.jpademo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repository;
	
	
	/*
	 * @PostConstruct public void init() {
	 * 
	 * List<User> users = new ArrayList<User>(); users.add(new User("karuna", "IT",
	 * 25)); users.add(new User("anbu", "Mech", 23)); users.add(new User("dinesh",
	 * "IT", 26)); users.add(new User("manoj", "IT", 23));
	 * 
	 * repository.saveAll(users);
	 * 
	 * }
	 */
	
	public List<User> getAllUsers(){
		return repository.findAll();
	}
	
	public List<User>getUserByName(String name){
		return repository.findByNameIgnoreCase(name);
	}
	
	public List<User>getUserByNameAndAgeAndProfession(String name,int age,String profession){
		return repository.findByNameAndAgeAndProfession(name,age,profession);
	}
	
	public long countByProfession(String profession){
		return repository.countByProfessionIgnoreCase(profession);
	}

	public List<User> getUserByNameAndProfession(String name, String profession) {
		return repository.findByNameAndProfessionIgnoreCase(name,profession);
	}
	
	public List<User>deleteByName(String name){
		return repository.deleteByName(name);
	}
	
	public User UpdateByUserID(User user) {
		User toModify=repository.getOne(user.getId());
		toModify.setName(user.getName());
		toModify.setAge(user.getAge());
		toModify.setProfession(user.getProfession());
		return repository.save(toModify);
	}
	
	public User insertUser(User user) {
		return repository.save(user);
	}
	

}
