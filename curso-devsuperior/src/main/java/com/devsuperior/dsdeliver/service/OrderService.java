package com.devsuperior.dsdeliver.service;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsdeliver.model.Order;
import com.devsuperior.dsdeliver.model.Product;
import com.devsuperior.dsdeliver.model.dtos.OrderDTO;
import com.devsuperior.dsdeliver.model.dtos.ProductDTO;
import com.devsuperior.dsdeliver.model.enums.OrderStatus;
import com.devsuperior.dsdeliver.repository.IOrderRepository;
import com.devsuperior.dsdeliver.repository.IProductRepository;

@Service
public class OrderService {

	@Autowired
	private IOrderRepository orderRepository;
	
	@Autowired
	private IProductRepository productRepository;
	
	@Transactional(readOnly = true)
	public List<OrderDTO> findAll() {
		List<Order> list = orderRepository.findOrdersWithProducts();
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional
	public OrderDTO insert(OrderDTO dto) {
		Order order = new Order(null, dto.getAddress(), dto.getLatitude(), dto.getLongitude(),
				Instant.now(), OrderStatus.PENDING);
		for (ProductDTO p : dto.getProducts()) {
			Product product = productRepository.getOne(p.getId());
			order.getProducts().add(product);
		}
		order = orderRepository.save(order);
		return new OrderDTO(order);
	}
}
