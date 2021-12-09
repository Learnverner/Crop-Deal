package com.tell.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tell.model.Cart;
import com.tell.services.CartService;


@RestController
@RequestMapping("/api/cart")
public class CartController {
	
 @Autowired
 CartService cartService;
 
//save the cartdetails
 @PostMapping("/additemtocart")
	public Cart save(@RequestBody Cart cart) {
		
		return cartService.save(cart);
	}
 
 
 // get all the cartdetails
 @GetMapping("/getallcarts")
	public List<Cart> getAll(){
		return cartService.getAllCarts();
	}
 
 //get cart by id
 @GetMapping("/getcartbyid/{id}")
 public Optional<Cart> getCartDetails(@PathVariable int id){
		return cartService.getCartById(id);
 }
 
 
 //update cart
 @PutMapping("/updatecart/{id}")
 public String updateCartDetails(@RequestBody Cart cart, @PathVariable int id) {
	
	 cartService.updateCartDetails(cart,id);
		return "Update cartdetails with id: "+id;
 }
 
//delete the Cart by id
@DeleteMapping("/delete/{id}")
public String deleteCartDetails(@PathVariable int id) {
cartService.deleteCartDetails(id);
return "Delete Cart with id: "+id;
}

 
 
}	

