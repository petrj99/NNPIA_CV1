package com.example.NNPIA_CV1.controllers;

import com.example.NNPIA_CV1.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyController {
    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
