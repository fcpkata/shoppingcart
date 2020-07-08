package com.shoppingcart.controller.domain;

import java.util.Collection;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ShoppingCart {
	private String userId;
	private Collection<CartItem> cartItems;
}
