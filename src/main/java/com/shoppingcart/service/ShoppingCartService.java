package com.shoppingcart.service;

import com.shoppingcart.controller.domain.ShoppingCart;

public interface ShoppingCartService {
	public ShoppingCart getCart(String userId);
}
