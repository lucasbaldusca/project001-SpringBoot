package com.vbsoft.project001.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vbsoft.project001.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	

}
