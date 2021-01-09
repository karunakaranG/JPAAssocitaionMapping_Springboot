package com.jpademo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpademo.dto.OrderResponse;
import com.jpademo.model.Task;
import com.jpademo.model.User;
import com.jpademo.repository.UserRepository;

@RestController
public class UserContactController {
	
	
	@Autowired
	UserRepository userRepository;

	@GetMapping("/saveUserAndTask")
	public String saveUserAndTask(){
	// TODO Auto-generated method stub
	User user=new User();
	user.setName("karuna");
	user.setAge(25);
	user.setProfession("IT");
	
	Task angular= new Task("Devleop angular application");
	Task springboot =new Task("Develop Springboot Application");
	
	user.getTasks().add(angular);
	user.getTasks().add(springboot);
	
	angular.getUsers().add(user);
	springboot.getUsers().add(user);
	
	return userRepository.save(user).toString();
	
	}


}
