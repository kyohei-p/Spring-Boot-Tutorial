package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class DemoApplicationTests {
	@Test
	public void testDemo() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		String expectedMessage = "Spring Message!";
		MessageService service = context.getBean(MessageService.class);
		assertEquals(expectedMessage, service.getMessage());
		context.close();
	}
}
