package com.devsuperior.dsdeliver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsdeliver.model.dtos.ProductDTO;
import com.devsuperior.dsdeliver.service.ProductService;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping
	public ResponseEntity<List<ProductDTO>> consultarTodos() {
		return ResponseEntity.ok(productService.findAll());
	}
}
