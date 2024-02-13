package com.example.NNPIA_CV1.controllers;

import org.springframework.stereotype.Controller;
import com.example.NNPIA_CV1.services.GreetingService;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(){
        this.greetingService = new GreetingService();
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
