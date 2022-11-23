package com.youtube.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.youtube.jwt.entity.Product;
import com.youtube.jwt.entity.ServiceRequest;
import com.youtube.jwt.service.ProductService;
import com.youtube.jwt.service.RequestService;

@RestController
public class ServiceRequestController {
	@Autowired
	RequestService requestservice;
	
	@PostMapping("/raiserequest")
	public ServiceRequest raise( @RequestBody ServiceRequest request) {
		
		return requestservice.raiseRequest(request);
}
}
