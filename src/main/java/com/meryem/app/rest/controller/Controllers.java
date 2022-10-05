package com.meryem.app.rest.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {

    @GetMapping(value = "/welcome")
    public String getPage(){
        return "Welcome";
    }
}
