package com.mrtkrkrt.lettuce.controller;

import com.mrtkrkrt.lettuce.model.Product;
import com.mrtkrkrt.lettuce.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository productRepository;

    @GetMapping("/")
    public ResponseEntity<List<Product>> retrieveAllProducts() {
        return ResponseEntity.ok((List<Product>) productRepository.findAll());
    }
}
