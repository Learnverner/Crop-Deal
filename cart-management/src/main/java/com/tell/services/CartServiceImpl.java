package com.tell.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tell.exceptions.CartNotFoundException;
import com.tell.exceptions.EmptyInputExceptions;
import com.tell.model.Cart;
import com.tell.model.Items;
import com.tell.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService {
  @Autowired	
  private CartRepository cartRepository;
  
//save the cartdetails
  @Override
  public Cart save( Cart cart) {
		if(cart.getItems().isEmpty()) {
			throw new EmptyInputExceptions("601","Provide item details");
		}
		Cart e =  cartRepository.save(cart);
		return e;
	}
		
  
  
  //get all cartdetails
  @Override
  public List<Cart> getAllCarts() {
  	List<Cart> cartList = cartRepository.findAll();
  	if(cartList.isEmpty()) {
  		throw new EmptyInputExceptions("602","Cart list is completely empty");
  	}
  	else {
  		return cartRepository.findAll();
  	}
  }

  
  //find cartdetails by id
  @Override
  public Optional<Cart> getCartById(int id){
	  Optional<Cart> findById= cartRepository.findById(id);
	  if(findById.isEmpty()) {
	  throw new EmptyInputExceptions("602","Cart not found with this ID!");
	  }else {
	  return cartRepository.findById(id);
	  }
	  }
  
  
  //update the cart
  @Override
  public String updateCartDetails( Cart cart, int id) {
	  boolean isCartExist=cartRepository.existsById(id);
		if(isCartExist)
			{
			cartRepository.save(cart);
			return "Update cartdetails with id: "+id;
			}
		else {
			throw new CartNotFoundException("603","Data is not found in DB");
		}
  }		
  
  
//delete by id
@Override
public String deleteCartDetails( int id) {
boolean isCartExist = cartRepository.existsById(id);
if(isCartExist) {
cartRepository.deleteById(id);
return "Delete Cartdetails with id: "+id;
}else {
throw new EmptyInputExceptions("604","Can not delete as cart not found with this ID");
}




}






}












