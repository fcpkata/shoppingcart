package com.shoppingcart.controller.domain;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Builder
@RequiredArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class CartItem {
	private final Product product;
	private final int quantity;
}
