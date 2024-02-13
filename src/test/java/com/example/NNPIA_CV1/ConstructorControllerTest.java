package com.example.NNPIA_CV1;

import controllers.ConstructorController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import services.GreetingService;

public class ConstructorControllerTest {
    ConstructorController constructorController;

    @BeforeEach
    void setUp(){
        constructorController = new ConstructorController(new GreetingService());
    }

    @Test
    void SayHello(){
        System.out.println(constructorController.sayHello());
    }
}
