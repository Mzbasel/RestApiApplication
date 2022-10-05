package com.meryem.app.rest;

import com.meryem.app.rest.controller.Controllers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ControllersTest {
    @Test public void
    return_welcome(){
        Controllers controllers = new Controllers();
        Assertions.assertEquals("Welcome", controllers.getPage());
    }
}
