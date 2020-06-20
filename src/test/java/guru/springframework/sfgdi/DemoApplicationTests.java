package guru.springframework.sfgdi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import guru.springframework.sfgdi.controllers.*;
@SpringBootTest
class DemoApplicationTest {

	PropertyInjectedController controller;

	@BeforeEach
	void setUp() {
		controller = new PropertyInjectedController();

		controller.greetingService = new GreetingServiceImpl();
	}

	@Test
	void getGreeting() {

		System.out.println(controller.getGreeting());
	}

}
