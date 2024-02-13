package com.example.NNPIA_CV1;

import com.example.NNPIA_CV1.controllers.ConstructorController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ConstructorControllerTest {

    @Autowired
    ConstructorController constructorController;

//    @BeforeEach
//    void setUp(){
//        constructorController = new ConstructorController(new GreetingService());
//    }

    @Test
    void SayHello(){
        System.out.println(constructorController.sayHello());
    }
}
