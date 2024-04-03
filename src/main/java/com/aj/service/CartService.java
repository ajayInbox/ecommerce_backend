package com.aj.service;

import com.aj.exception.ProductException;
import com.aj.modal.Cart;
import com.aj.modal.User;
import com.aj.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public String addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
