package com.zee.store.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {

    @GetMapping
    public ResponseEntity<List<String>> getProducts() {
        return ResponseEntity
                .ok()
                .body(List.of("Samsung","Apple","Vivo"));
    }
}
