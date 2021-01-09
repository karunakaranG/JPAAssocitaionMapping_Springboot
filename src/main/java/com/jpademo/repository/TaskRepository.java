package com.jpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpademo.model.Task;

public interface TaskRepository extends JpaRepository<Task, Integer>{

}
