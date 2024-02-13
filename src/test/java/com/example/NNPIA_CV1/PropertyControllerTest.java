package com.example.NNPIA_CV1;

import com.example.NNPIA_CV1.controllers.PropertyController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.example.NNPIA_CV1.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PropertyControllerTest {
    @Autowired
    PropertyController propertyController;

    @BeforeEach
    void setUp(){
        //propertyController = new PropertyController();
        propertyController.greetingService = new GreetingService();
    }

    @Test
    void sayHello(){
        System.out.println(propertyController.sayHello());
    }
}
