package com.example.NNPIA_CV1;

import com.example.NNPIA_CV1.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyControllerTest {

    @Test
    void sayHello(){
        MyController controller = new MyController();

        System.out.println(controller.sayHello());
    }
}
