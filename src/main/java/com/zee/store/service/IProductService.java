package com.zee.store.service;

import com.zee.store.dto.ProductDto;
import com.zee.store.entity.Product;

import java.util.List;


public interface IProductService {

    List<ProductDto> getProducts();
    ProductDto addProduct(Product product);
}
