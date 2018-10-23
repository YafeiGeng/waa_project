package com.packt.webstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packt.webstore.domain.Movie;
import com.packt.webstore.repository.MovieRepository;
import com.packt.webstore.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private MovieRepository productRepository;
	
	public void processOrder(String productId, long quantity) {
		Movie productById = productRepository.getMovieByMovieId(productId);
		
//		if(productById.getUnitsInStock() < quantity){
//			throw new IllegalArgumentException("Out of Stock. Available Units in stock"+ productById.getUnitsInStock());
//		}
//		
//		productById.setUnitsInStock(productById.getUnitsInStock() - quantity);
	}
}
