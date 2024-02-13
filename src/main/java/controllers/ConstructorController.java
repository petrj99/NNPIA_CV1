package controllers;

import services.GreetingService;

public class ConstructorController {
    private final GreetingService greetingService;


    public ConstructorController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
