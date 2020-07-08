package com.shoppingcart.repository;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.google.common.collect.ImmutableSet;
import com.shoppingcart.controller.domain.CartItem;
import com.shoppingcart.controller.domain.Product;
import com.shoppingcart.controller.domain.ShoppingCart;

@Component
public class ShoppingCartMockRepository implements ShoppingCartRepository {
	@Override
	public ShoppingCart getCart(String userId) {
		return ShoppingCart.builder()
				.userId(userId)
				.cartItems(getItems())
			.build();
	}
	
	private Collection<CartItem> getItems() {
		CartItem cartItem1 = CartItem.builder()
				.product(Product.builder()
							.id("BOOK1")
							.name("Clean Code")
							.description("Book on clean code practices")
							.price("100")
						.build())
				.quantity(2)
				.build();
		
		CartItem cartItem2 = CartItem.builder()
				.product(Product.builder()
							.id("BOOK2")
							.name("The Pragmatic Programmer")
							.description("How to be a better programmer")
							.price("100")
						.build())
				.quantity(1)
				.build();
		
		return ImmutableSet.<CartItem> builder()
					.add(cartItem1)
					.add(cartItem2)
				.build();
	}
}
