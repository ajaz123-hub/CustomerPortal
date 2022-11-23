package com.youtube.jwt.dao;

import org.springframework.data.repository.CrudRepository;

import com.youtube.jwt.entity.ServiceRequest;



//
public interface ServiceRequestDao  extends CrudRepository<ServiceRequest, Integer> {

}
