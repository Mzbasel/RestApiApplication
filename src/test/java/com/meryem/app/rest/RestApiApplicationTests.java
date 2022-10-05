package com.meryem.app.rest;

import com.meryem.app.rest.controller.Controllers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestApiApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test public void
	return_welcome(){
		Controllers controllers = new Controllers();
		Assertions.assertEquals("   Welcome", controllers.getPage());
	}

	@Test public void
	failing_test(){
		Assertions.assertEquals("Welcome", 0);
	}

}
