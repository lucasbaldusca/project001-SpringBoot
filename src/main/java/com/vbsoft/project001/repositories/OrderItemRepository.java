package com.vbsoft.project001.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vbsoft.project001.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	

}
