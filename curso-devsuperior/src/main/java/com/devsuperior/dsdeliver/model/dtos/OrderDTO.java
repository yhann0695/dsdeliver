package com.devsuperior.dsdeliver.model.dtos;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.devsuperior.dsdeliver.model.Order;
import com.devsuperior.dsdeliver.model.enums.OrderStatus;

public class OrderDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5876930390226520220L;

	private Long id;

	private String address;

	private Double latitude;

	private Double longitude;

	private Instant moment;

	private OrderStatus status;

	private List<ProductDTO> products = new ArrayList<ProductDTO>();
	
	

	public OrderDTO(Long id, String address, Double latitude, Double longitude, Instant moment, OrderStatus status) {
		this.id = id;
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
		this.moment = moment;
		this.status = status;
	}

	public OrderDTO(Order entidade) {
		id = entidade.getId();
		address = entidade.getAddress();
		latitude = entidade.getLatitude();
		longitude = entidade.getLongitude();
		moment = entidade.getMoment();
		status = entidade.getStatus();
		products = entidade.getProducts().stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}
	
	public OrderDTO() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<ProductDTO> getProducts() {
		return products;
	}
	
	
	
	
}
