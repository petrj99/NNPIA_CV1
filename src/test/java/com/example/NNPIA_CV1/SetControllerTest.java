package com.example.NNPIA_CV1;

import com.example.NNPIA_CV1.controllers.SetController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.example.NNPIA_CV1.services.GreetingService;

public class SetControllerTest {
    SetController setController;

    @BeforeEach
    void setUp(){
        setController = new SetController();
        setController.setGreetingService(new GreetingService());
    }

    @Test
    void SayHello(){
        System.out.println(setController.sayHello());
    }
}
