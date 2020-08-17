package com.vbsoft.project001.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vbsoft.project001.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
