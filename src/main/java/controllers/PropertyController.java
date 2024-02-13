package controllers;

import services.GreetingService;

public class PropertyController {
    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
