package com.imran.helloboot.controller;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FlashControllerTest {
	@Test
	public void shoudlReturnResponse() {
		FlashController flashController = new FlashController();
		String response = flashController.getResponse();
		
		Assertions.assertThat(response).isEqualTo("thunder");
	}
}
