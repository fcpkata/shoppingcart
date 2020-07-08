package com.shoppingcart.controller.domain;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
@EqualsAndHashCode
public class Product {
	private String id;
	private String name;
	private String price;
	private String description;
}
