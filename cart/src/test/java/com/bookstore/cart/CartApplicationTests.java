package com.bookstore.cart;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CartApplicationTests {

	@Test
	void contextLoads() {
		int finalNumber = 5;
		assertThat(finalNumber).isEqualTo(5);
	}

}
