package io.github.malise.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.malise.orderservice.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

    
} 
