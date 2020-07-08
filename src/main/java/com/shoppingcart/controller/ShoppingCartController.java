package com.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingcart.controller.domain.ShoppingCart;
import com.shoppingcart.service.ShoppingCartService;

@RestController
@RequestMapping(value = "/api/v1", produces = "application/json" )
public class ShoppingCartController {
	private ShoppingCartService shoppingCartService;

	@Autowired
	public ShoppingCartController(ShoppingCartService shoppingCartService) {
		this.shoppingCartService = shoppingCartService;
	}
	
	@GetMapping("/shopping-cart/{userId}")
	public ResponseEntity<ShoppingCart> getResponse(@PathVariable("userId") String userId) {
		return ResponseEntity
				.ok(shoppingCartService.getCart(userId));
	}
}
