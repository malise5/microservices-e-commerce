package io.github.malise.productservice.service;

import java.util.List;

import io.github.malise.productservice.model.ProductCreateRequest;
import io.github.malise.productservice.model.ProductCreateResponse;

public interface ProductService {

    ProductCreateResponse createProduct(ProductCreateRequest productCreateRequest);

    List<ProductCreateResponse> findAll();
    
}
