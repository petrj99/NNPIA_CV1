package com.example.NNPIA_CV1;

import controllers.MyController;
import org.junit.jupiter.api.Test;
import services.GreetingService;

public class MyControllerTest {

    @Test
    void sayHello(){
        MyController controller = new MyController();

        System.out.println(controller.sayHello());
    }
}
