package com.verizon.product.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.product.entity.Product;
import com.verizon.product.service.ProductService;

@RestController
@RequestMapping("api/products")
public class ProductController {
	
	@Autowired
	ProductService service;

	@GetMapping("/products/all")
	public Iterable<Product> getAllProducts(){
		return service.getAllProducts();
	}
	
	@PostMapping("/product")
	public Product addNewProduct(@RequestBody Product product) {
		return service.addNewProduct(product);
	}
	
	@GetMapping("/product/{id}")
	public Product findById(@PathVariable Integer id){
		return service.findById(id);
	}
	
	
	
}
