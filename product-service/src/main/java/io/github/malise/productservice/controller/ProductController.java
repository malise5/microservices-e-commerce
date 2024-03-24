package io.github.malise.productservice.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.github.malise.productservice.entity.Product;
import io.github.malise.productservice.model.GenericResponse;
import io.github.malise.productservice.model.ProductCreateRequest;
import io.github.malise.productservice.model.ProductCreateResponse;
import io.github.malise.productservice.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;

@RequestMapping("api/products")
@RestController
@Slf4j
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public GenericResponse<List<ProductCreateResponse>> list() {
        List<ProductCreateResponse> pr = productService.findAll();
        GenericResponse<List<ProductCreateResponse>> resp = GenericResponse.<List<ProductCreateResponse>>builder()
                .success(true)
                .msg("Data fetched Successful")
                .data(pr)
                .build();
        return resp;
    }

    @PostMapping
    public GenericResponse<ProductCreateResponse> createProduct(@RequestBody ProductCreateRequest productCreateRequest) {
        ProductCreateResponse pr = productService.createProduct(productCreateRequest);
        GenericResponse<ProductCreateResponse> resp = GenericResponse.<ProductCreateResponse>builder()
                .success(true)
                .msg("Data saved Successful")
                .data(pr)
                .build();
        return resp;
    }

}
