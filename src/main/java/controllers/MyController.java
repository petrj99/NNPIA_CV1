package controllers;

import services.GreetingService;

public class MyController {
    private final GreetingService greetingService;

    public MyController(){
        this.greetingService = new GreetingService();
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
