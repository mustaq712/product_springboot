package com.verizon.product.repository;

import org.springframework.data.repository.CrudRepository;

import com.verizon.product.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
 
}
