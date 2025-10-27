package com.zee.store.controller;

import com.zee.store.dto.ProductDto;
import com.zee.store.entity.Product;
import com.zee.store.repository.ProductRepository;
import com.zee.store.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {

    private final IProductService productService;

    @Autowired
    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<ProductDto>> getProducts() {
        List<ProductDto> productList = productService.getProducts();
        return ResponseEntity
                .ok()
                .body(productList);
    }

    @PostMapping
    public ResponseEntity<ProductDto> addProduct(@RequestBody Product product) {
        ProductDto product1 = productService.addProduct(product);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(product1);
    }
}
