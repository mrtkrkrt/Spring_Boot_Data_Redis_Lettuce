package com.mrtkrkrt.lettuce.repository;

import com.mrtkrkrt.lettuce.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
