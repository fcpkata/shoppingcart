package com.shoppingcart.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.shoppingcart.controller.domain.ShoppingCart;
import com.shoppingcart.service.ShoppingCartService;

@ExtendWith(MockitoExtension.class)
public class ShoppingCartControllerTest {
	@Mock
	private ShoppingCartService shoppingCartService;
	
	@Test
	public void shoudlReturnSuccessResponse() {
		String userId = "12345";
		ShoppingCartController controller = new ShoppingCartController(shoppingCartService);
		when(shoppingCartService.getCart(userId))
			.thenReturn(ShoppingCart.builder().build());
		
		ResponseEntity<ShoppingCart> response = controller.getResponse(userId);
		
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(response.getBody()).isNotNull();
		
		verify(shoppingCartService).getCart(userId);
	}
}
