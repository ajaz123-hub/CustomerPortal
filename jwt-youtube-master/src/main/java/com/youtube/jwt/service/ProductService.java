package com.youtube.jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.youtube.jwt.dao.ProductDao;
import com.youtube.jwt.entity.Product;

@Service
public class ProductService {
	@Autowired
	ProductDao productdao;
	
	public Product addproducts(Product product)
	{
		return productdao.save(product);
	}

}
