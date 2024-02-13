package com.example.NNPIA_CV1.controllers;

import com.example.NNPIA_CV1.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetController {

    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(GreetingService greetingService){
        System.out.println("SetContoller executed");
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
