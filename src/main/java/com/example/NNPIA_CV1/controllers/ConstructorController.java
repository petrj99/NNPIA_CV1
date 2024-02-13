package com.example.NNPIA_CV1.controllers;

import org.springframework.stereotype.Controller;
import com.example.NNPIA_CV1.services.GreetingService;

@Controller
public class ConstructorController {
    private final GreetingService greetingService;

    public ConstructorController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
