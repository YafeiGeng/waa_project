package com.packt.webstore.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.packt.webstore.domain.Movie;

/*
 * This is the webstore8 implementation of the repository interface
 */

public interface ProductRepositoryLite {

	List <Movie> getAllProducts();
	
	Movie getProductById(String key);
	
	List<Movie> getProductsByCategory(String category);

	Set<Movie> getProductsByFilter(Map<String, List<String>> filterParams);
	
	void addProduct(Movie product);		
}
