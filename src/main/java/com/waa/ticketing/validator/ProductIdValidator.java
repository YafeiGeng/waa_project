package com.waa.ticketing.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.waa.ticketing.domain.Movie;
import com.waa.ticketing.exception.ProductNotFoundException;
import com.waa.ticketing.service.MovieService;

public class ProductIdValidator implements ConstraintValidator<ProductId, String>{
	
	@Autowired
	private MovieService productService;

	@Override
	public void initialize(ProductId constraintAnnotation) {
		//  intentionally left blank; this is the place to initialize the constraint annotation for any sensible default values.
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		Movie product;
		try {
			product = productService.getMovieById(value);
			
		} catch (ProductNotFoundException e) {
			return true;
		}
		
		if(product!= null) {
			return false;
		}
		
		return true;
	}
	
}
