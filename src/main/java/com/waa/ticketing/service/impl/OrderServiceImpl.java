package com.waa.ticketing.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waa.ticketing.domain.Movie;
import com.waa.ticketing.repository.MovieRepository;
import com.waa.ticketing.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private MovieRepository productRepository;
	
	@Override
	public void processOrder(String productId, long quantity) {
		Movie productById = productRepository.getMovieByMovieId(productId);
		
//		if(productById.getUnitsInStock() < quantity){
//			throw new IllegalArgumentException("Out of Stock. Available Units in stock"+ productById.getUnitsInStock());
//		}
//		
//		productById.setUnitsInStock(productById.getUnitsInStock() - quantity);
	}
}
