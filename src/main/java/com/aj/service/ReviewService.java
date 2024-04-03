package com.aj.service;

import java.util.List;

import com.aj.exception.ProductException;
import com.aj.modal.Review;
import com.aj.modal.User;
import com.aj.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
