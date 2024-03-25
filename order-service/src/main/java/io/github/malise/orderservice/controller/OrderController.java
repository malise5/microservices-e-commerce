package io.github.malise.orderservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.malise.orderservice.model.GenericResponse;
import io.github.malise.orderservice.model.OrderRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RequestMapping("/api/orders")
@RestController
public class OrderController {

    @PostMapping("placeOrder")
    public GenericResponse<String> placeOrder(@RequestBody OrderRequest orderRequest) {
        
        return "entity";
    }
    
    
}
