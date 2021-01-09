package com.jpademo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpademo.model.User;
import com.jpademo.service.UserService;

@RestController
@RequestMapping("/Commoncontroller")
public class CommonController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/getUsers")
	public String getUsers(){
		return userService.getAllUsers().toString();
	}
	
	@GetMapping("/getUserByName/{name}")
	public String getUserByName(@PathVariable String name) {
		return userService.getUserByName(name).toString();
	}
	
	@GetMapping("/getUserByNameAndAgeAndProfession/{name}/{age}/{profession}")
	public String getUserByNameAndAgeAndProfession(@PathVariable String name,@PathVariable int age,@PathVariable String profession) {
		return userService.getUserByNameAndAgeAndProfession(name,age,profession).toString();
	}
	
	@GetMapping("/getUserByNameAndProfession/{name}/{profession}")
	public String getUserByNameAndProfession(@PathVariable String name,@PathVariable String profession) {
		return userService.getUserByNameAndProfession(name,profession).toString();
	}

	@GetMapping("/countByProfession/{profession}")
	public long countByProfession(@PathVariable String profession) {
		return userService.countByProfession(profession);
	}
	
	@DeleteMapping("/deleteByName/{name}")
	public String deleteByName(@PathVariable String name) {
		System.out.println(name);
		return userService.deleteByName(name).toString();
	}
	
	@PutMapping("/UpdateByUserID")
	public String UpdateByUserID(@RequestBody User user ) {
		return userService.UpdateByUserID(user).toString();
	}
	
	@PostMapping("/insertUser")
	public String insertUser(@RequestBody User user) {
		return userService.insertUser(user).toString();
	}
	
	
}
