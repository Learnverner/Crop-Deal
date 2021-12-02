package com.tell.repository;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.tell.model.Cart;

public interface CartRepository extends MongoRepository<Cart, Integer> {





}
