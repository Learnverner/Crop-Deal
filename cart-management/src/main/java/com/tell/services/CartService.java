package com.tell.services;

import java.util.List;
import java.util.Optional;

import com.tell.model.Cart;
import com.tell.model.Items;
public interface CartService {
	
	public Cart save( Cart cart);
	 public Optional<Cart> getCartById(int id);
	
	public List<Cart>getAllCarts();
	
	public String updateCartDetails( Cart cart, int id);
	public String deleteCartDetails( int id);
	
}
