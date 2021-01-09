package com.jpademo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jpademo.dto.OrderResponse;
import com.jpademo.model.User;

@Transactional
public interface UserRepository extends JpaRepository<User, Integer>{

	List<User> findByNameIgnoreCase(String name);

	List<User> findByNameAndAge(String name, int age);

	long countByProfessionIgnoreCase(String profession);

	//ignorecase not working in and scenario
	List<User> findByNameAndProfessionIgnoreCase(String name, String profession);

	List<User> deleteByName(String name);

	List<User> findByNameAndAgeAndProfession(String name, int age, String profession);

	@Query("SELECT new com.jpademo.dto.OrderResponse(u.name,p.productName) FROM User u JOIN u.products p")
	public List<OrderResponse> getJoinInformation();
	
	@Query("SELECT new com.jpademo.dto.OrderResponse(u.name,c.contactNumber) FROM User u JOIN u.contact c")
	public List<OrderResponse> getNameAndContactDetails();
}
