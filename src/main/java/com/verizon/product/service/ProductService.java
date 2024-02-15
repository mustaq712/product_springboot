package com.verizon.product.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.product.entity.Product;
import com.verizon.product.repository.ProductRepository;

@Service
public class ProductService {
  
	@Autowired
	ProductRepository repository;
	
	public Iterable<Product> getAllProducts() {
		return repository.findAll();
	}
	
	public Product addNewProduct(Product product) {
		repository.save(product);
		return product;
	}
	
//	public Product findByname(String name) {
//		return repository.findByProductName(name);
//	}
	
	
	
	public Product findById(Integer id) {
		return repository.findById(id).orElse(null);
	}
}
