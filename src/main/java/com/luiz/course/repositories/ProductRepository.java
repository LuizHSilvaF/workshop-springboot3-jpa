package com.luiz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luiz.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
