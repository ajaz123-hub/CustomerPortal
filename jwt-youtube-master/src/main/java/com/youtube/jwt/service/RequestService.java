package com.youtube.jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youtube.jwt.dao.ServiceRequestDao;
import com.youtube.jwt.entity.Product;
import com.youtube.jwt.entity.ServiceRequest;

@Service
public class RequestService {
	
	@Autowired
	ServiceRequestDao servicedao;
	
	public ServiceRequest raiseRequest(ServiceRequest service)
	{
		return servicedao.save(service);
	}

	
}
