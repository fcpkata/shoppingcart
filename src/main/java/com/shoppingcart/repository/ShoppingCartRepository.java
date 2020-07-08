package com.shoppingcart.repository;

import com.shoppingcart.controller.domain.ShoppingCart;

public interface ShoppingCartRepository {
	public ShoppingCart getCart(String userId);
}
