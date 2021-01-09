package com.jpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpademo.model.Contact;

public interface ContactRepository extends JpaRepository<Contact,Integer> {

}
