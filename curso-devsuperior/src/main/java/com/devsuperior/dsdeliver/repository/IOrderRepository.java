package com.devsuperior.dsdeliver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdeliver.model.Order;

public interface IOrderRepository extends JpaRepository<Order, Long>{

}
