package com.youtube.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.youtube.jwt.entity.Product;
import com.youtube.jwt.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productservice;
	
	@PostMapping("/addproducts")
	public Product addproducts( @RequestBody Product product) {
		
		return productservice.addproducts(product);
}
}
