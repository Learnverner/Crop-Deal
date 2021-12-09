package com.tell;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.tell.exceptions.EmptyInputExceptions;
import com.tell.model.Cart;
import com.tell.model.Items;
import com.tell.repository.CartRepository;
import com.tell.services.CartService;
@RunWith(SpringRunner.class)
@SpringBootTest
class CropCartManagementApplicationTests {
	
	@Autowired
	 private CartService cartService;
	
	@MockBean
	private CartRepository cartRepository;

	// get all card
	@Test
	public void getAllCartTest()
	{
	when(cartRepository.findAll()).thenReturn(Stream.of
	(new Cart(2,1000.0,Arrays.asList(new Items("Apple",20000.0,3))),new Cart(2,1000.0,
	Arrays.asList(new Items("Chickoo",10000.0,3))))
	.collect(Collectors.toList()));
	assertEquals(2,cartService.getAllCarts().size());
	}
	
	
	
	//add cart
	@Test
	public void addCart()
	{
	Cart cart = new Cart(2,1000.0,Arrays.asList(new Items("Banana",100.0,3)));
	when(cartRepository.save(cart)).thenReturn(cart);
	assertEquals(cart,cartService.save(cart));

	 }
}