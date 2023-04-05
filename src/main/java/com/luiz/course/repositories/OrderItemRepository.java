package com.luiz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luiz.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	 

}
