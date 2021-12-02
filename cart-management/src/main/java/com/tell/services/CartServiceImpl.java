package com.tell.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tell.model.Cart;
import com.tell.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService {
  @Autowired	
  private CartRepository cartRepository;
  
 

	public Cart additemtocart( Cart cart) {
		
		return cartRepository.save(cart);
	}
		
  @Override
  public Optional<Cart> getCartById(int id){
		return cartRepository.findById(id);
	}
  
  
  @Override
  public String updateCart( Cart cart, int id) {
		cartRepository.findById(id);
		cartRepository.save(cart);
		return "Update cart with id: "+id;
  }		

@Override
public List<Cart> getAllCarts() {

	return cartRepository.findAll();
}

@Override
public Cart save(Cart cart) {
	// TODO Auto-generated method stub
	return null;
}








}
