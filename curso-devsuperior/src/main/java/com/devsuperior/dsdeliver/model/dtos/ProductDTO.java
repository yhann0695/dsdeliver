package com.devsuperior.dsdeliver.model.dtos;

import java.io.Serializable;

import com.devsuperior.dsdeliver.model.Product;


public class ProductDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8361712120807327295L;
	
	private Long id;
	
	private String name;
	
	private Double price;
	
	private String description;
	
	private String imageUri;

	public ProductDTO() {
		
	}
	
	public ProductDTO(Long id, String name, Double price, String description, String imageUri) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.imageUri = imageUri;
	}
	
	public ProductDTO(Product entidade) {
		id = entidade.getId();
		name = entidade.getName();
		price = entidade.getPrice();
		description = entidade.getDescription();
		imageUri = entidade.getImageUri();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}
	
	
	
	
}
