package com.hsynsarsilmaz.echo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/ping")
    public String getPing(){
        return "System is Working!";
    }
}
