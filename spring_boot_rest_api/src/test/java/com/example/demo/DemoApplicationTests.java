package com.example.demo;
import lombok.Data;
import lombok.AllArgsConstructor;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@Data @AllArgsConstructor class Tea {
	private String name;
	private int amount;
}

@SpringBootTest
class DemoApplicationTests {

	@Test
	void testExample() {
		var tea = new Tea("abc", 3);

		tea.setName("abc");
		tea.setAmount(5);

		assertEquals("", tea.getAmount(), 5);
		assertEquals("", tea.getName(), "abc");
	}
}

