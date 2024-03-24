package io.github.malise.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.malise.productservice.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
    
}
