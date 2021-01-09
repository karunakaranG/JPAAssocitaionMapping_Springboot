package com.jpademo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpademo.dto.OrderRequest;
import com.jpademo.dto.OrderResponse;
import com.jpademo.model.User;
import com.jpademo.repository.UserRepository;

@RestController
public class OrderController {
	
	@Autowired
	UserRepository userRepository;
	
	@PostMapping("/saveAllProducts")
	public List<User> saveAllUserAndProduct(@RequestBody OrderRequest request){
		System.out.println(request.getUser().toString());
		return userRepository.saveAll(request.getUser());
	}
	
	@GetMapping("/getAllUsers")
	public List<User> getAllUserAndProduct(){
		return userRepository.findAll();
	}
	
	@GetMapping("/getJoinWithNameAndProductName")
		public List<OrderResponse> getJoinWithNameAndProductName(){
			return userRepository.getJoinInformation();
		}
	
	@GetMapping("/getNameAndContactDetails")
	public List<OrderResponse>getNameAndContactDetails(){
		return userRepository.getNameAndContactDetails();
	}

}
