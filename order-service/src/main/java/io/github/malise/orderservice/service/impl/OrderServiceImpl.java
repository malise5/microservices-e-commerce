package io.github.malise.orderservice.service.impl;

import org.springframework.stereotype.Service;

import io.github.malise.orderservice.repository.OrderRepository;
import io.github.malise.orderservice.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    
    
}
