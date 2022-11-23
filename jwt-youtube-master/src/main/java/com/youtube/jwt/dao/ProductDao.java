package com.youtube.jwt.dao;

import org.springframework.data.repository.CrudRepository;

import com.youtube.jwt.entity.Product;

public interface ProductDao extends CrudRepository<Product, Integer> {

}
