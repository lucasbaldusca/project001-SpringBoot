package com.vbsoft.project001.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vbsoft.project001.entities.Order;
import com.vbsoft.project001.entities.User;

public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
