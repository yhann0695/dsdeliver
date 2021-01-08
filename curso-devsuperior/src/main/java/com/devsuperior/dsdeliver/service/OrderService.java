package com.devsuperior.dsdeliver.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsdeliver.model.Order;
import com.devsuperior.dsdeliver.model.dtos.OrderDTO;
import com.devsuperior.dsdeliver.repository.IOrderRepository;

@Service
public class OrderService {

	@Autowired
	private IOrderRepository orderRepository;
	
	@Transactional(readOnly = true)
	public List<OrderDTO> findAll() {
		List<Order> list = orderRepository.findOrdersWithProducts();
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}
}
