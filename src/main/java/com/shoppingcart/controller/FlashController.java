package com.shoppingcart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlashController {
	@GetMapping("/flash")
	public String getResponse() {
		return "thunder";
	}
}
