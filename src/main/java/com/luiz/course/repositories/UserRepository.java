package com.luiz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luiz.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	 

}
