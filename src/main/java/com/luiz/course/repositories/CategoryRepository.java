package com.luiz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luiz.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
