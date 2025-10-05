package com.zee.store.service.impl;

import com.zee.store.dto.ProductDto;
import com.zee.store.entity.Product;
import com.zee.store.repository.ProductRepository;
import com.zee.store.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements IProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductDto> getProducts() {
        return productRepository.findAll()
                .stream().map(this::getProductDTO).collect(Collectors.toList());
    }

    @Override
    public ProductDto addProduct(Product product) {
        return this.getProductDTO(productRepository.save(product));
    }

    private ProductDto getProductDTO(Product product) {
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product, productDto);
        productDto.setProductId(product.getId());
        return productDto;
    }
}
