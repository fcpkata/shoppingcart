package com.shoppingcart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingcart.controller.domain.ShoppingCart;
import com.shoppingcart.repository.ShoppingCartRepository;

@Service
public class ShoppingCartServiceMockImpl implements ShoppingCartService {
	private ShoppingCartRepository shoppingCartRepository;
	
	@Autowired
	public ShoppingCartServiceMockImpl(ShoppingCartRepository shoppingCartRepository) {
		this.shoppingCartRepository = shoppingCartRepository;
	}
	
	@Override
	public ShoppingCart getCart(String userId) {
		return shoppingCartRepository.getCart(userId);
	}
}
