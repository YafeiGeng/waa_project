package com.waa.ticketing.domain.query;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.waa.ticketing.domain.Movie;

/*
 * How to use the Criteria API with Spring Data
 * See ProductServiceImpl findBySpec
 */
public class ProductSpecification implements Specification<Movie> {

	  private final Movie product;

	  public ProductSpecification(Movie product) {
	    this.product = product;
	  }

	
	 @Override
	  public Predicate toPredicate(Root<Movie> root, CriteriaQuery<?> cq, CriteriaBuilder cb) {
	    List<Predicate> predicates = new ArrayList<>();

//	    if (!StringUtils.isNullOrEmpty(product.getCategory())) {
//	        predicates.add(cb.equal(root.get("category"), product.getCategory()));
//	      }
//	    // finds by either Category OR productId
//	    else if (!StringUtils.isNullOrEmpty(product.getProductId())) {
//	    	// StartsWith
//	        predicates.add(cb.like(root.get("productId"), (product.getProductId() + "%")));
//	    	// Contains
////	        predicates.add(cb.like(root.get("productId"), ("%" + product.getProductId() + "%")));
//	    	// EndsWith
////	        predicates.add(cb.like(root.get("productId"), ("%" + product.getProductId())));
//	      }
	    
	    return cb.and(predicates.toArray(new Predicate[0]));

	 }
	 
   
}
