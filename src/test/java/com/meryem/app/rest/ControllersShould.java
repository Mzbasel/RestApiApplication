package com.meryem.app.rest;

import com.meryem.app.rest.controller.Controllers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ControllersShould {
    @Test public void
    return_welcome(){
        Controllers controllers = new Controllers();
        Assertions.assertEquals("welcome", controllers.getPage());
    }
}
