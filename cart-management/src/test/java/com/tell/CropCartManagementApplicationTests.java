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
	
	@Autowired
	private CartRepository cartRepository;

/*	@Test
	public Cart getAllCartsTest()
	{
		when(cartRepository.findAll()).thenReturn(Stream.of
				(new Cart(2,1000,Arrays.asList(new Items("Banana",100.0,10))))
				.collect(Collectors.toList()));
				assertEquals(1,cartService.getAllCarts().size());
				
				}
*/

	
	@Test
	public Cart save() throws EmptyInputExceptions
	{
		Cart cart = new Cart(2,1000,Arrays.asList(new Items("Banana",100.0,10)));
	when(cartRepository.save(cart)).thenReturn(cart);
	assertEquals(cart,cartService.save(cart));
	return cart;
	}
	}

