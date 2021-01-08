package com.devsuperior.dsdeliver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdeliver.model.Product;

public interface IProductRepository extends JpaRepository<Product, Long>{

	List<Product> findAllByOrderByNameAsc();
	
	

}
