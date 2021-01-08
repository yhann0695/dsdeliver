package com.devsuperior.dsdeliver.service;

import java.util.List;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsdeliver.model.Product;
import com.devsuperior.dsdeliver.model.dtos.ProductDTO;
import com.devsuperior.dsdeliver.repository.IProductRepository;

@Service
public class ProductService {

	@Autowired
	private IProductRepository repository;
	
	@Transactional(readOnly = true)
	public List<ProductDTO> findAll() {
		List<Product> list = repository.findAllByOrderByNameAsc();
		return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
		
	}
}
