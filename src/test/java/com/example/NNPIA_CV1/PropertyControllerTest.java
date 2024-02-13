package com.example.NNPIA_CV1;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import controllers.PropertyController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import services.GreetingService;

public class PropertyControllerTest {
    PropertyController propertyController;

    @BeforeEach
    void setUp(){
        propertyController = new PropertyController();
        propertyController.greetingService = new GreetingService();
    }

    @Test
    void sayHello(){
        System.out.println(propertyController.sayHello());
    }
}
