package com.aj.service;

import java.util.List;

import com.aj.exception.ProductException;
import com.aj.modal.Rating;
import com.aj.modal.User;
import com.aj.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
