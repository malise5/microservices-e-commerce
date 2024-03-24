package io.github.malise.productservice.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import io.github.malise.productservice.entity.Product;
import io.github.malise.productservice.exception.ProductNotFoundException;
import io.github.malise.productservice.model.ProductCreateRequest;
import io.github.malise.productservice.model.ProductCreateResponse;
import io.github.malise.productservice.repository.ProductRepository;
import io.github.malise.productservice.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductCreateResponse createProduct(ProductCreateRequest productCreateRequest) {
       var saveProduct =  productRepository.save(mapToProductEntity(productCreateRequest));
       return mapToProductCreateResponse(saveProduct);
    }

    private Product mapToProductEntity(ProductCreateRequest source) {
        Product target = new Product();
        BeanUtils.copyProperties(source, target);
        return target;
    }

    private ProductCreateResponse mapToProductCreateResponse(Product source) {
        ProductCreateResponse target = new ProductCreateResponse();
        BeanUtils.copyProperties(source, target);
        return target;
    }

    @Override
    public List<ProductCreateResponse> findAll() {
        return productRepository.findAll().stream().map(this::mapToProductCreateResponse).toList();
    }

    @Override
    public ProductCreateResponse findById(Integer productId) {
        var pr =  productRepository.findById(productId);
        if (pr.isPresent()) {
            return mapToProductCreateResponse(pr.get());
        }

        throw new ProductNotFoundException("Product with id not found");
    }

}
