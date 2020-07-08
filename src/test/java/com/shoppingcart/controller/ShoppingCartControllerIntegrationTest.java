package com.shoppingcart.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class ShoppingCartControllerIntegrationTest {
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void shouldReturnResponse() throws Exception {
		String userId = "12345";
		mockMvc.perform(get("/api/v1/shopping-cart/" + userId ))
			.andDo(print())
			.andExpect(status().isOk())
			.andExpect(content().contentType(MediaType.APPLICATION_JSON))
			.andExpect(MockMvcResultMatchers.jsonPath("$.userId").value(userId))
			.andExpect(MockMvcResultMatchers.jsonPath("$.cartItems.length()").value(2))
			.andExpect(MockMvcResultMatchers.jsonPath("$.cartItems[0].product.id").value("BOOK1"))
			.andExpect(MockMvcResultMatchers.jsonPath("$.cartItems[0].quantity").value(2))
			.andExpect(MockMvcResultMatchers.jsonPath("$.cartItems[1].product.id").value("BOOK2"))
			.andExpect(MockMvcResultMatchers.jsonPath("$.cartItems[1].quantity").value(1))
			;
	}
}
