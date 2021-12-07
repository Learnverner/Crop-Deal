package com.tell.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.tell.model.Order;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {
	
	private RestTemplate restTemplate;

	@RequestMapping("/pay")
	public Order getorder(){
	Order order = restTemplate.getForObject("http://crop-paypal-payments/",Order.class);
	return order;
	}
}
