package com.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpademo.model.Task;
import com.jpademo.model.User;
import com.jpademo.repository.TaskRepository;
import com.jpademo.repository.UserRepository;

@SpringBootApplication
public class SpringJpaDemoApplication{


	
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaDemoApplication.class, args);
	}


}
