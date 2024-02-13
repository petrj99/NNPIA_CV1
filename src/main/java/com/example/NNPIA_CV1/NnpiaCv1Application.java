package com.example.NNPIA_CV1;

import com.example.NNPIA_CV1.controllers.MyController;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NnpiaCv1Application {

	public static void main(String[] args) {
//		ApplicationContext context = (ApplicationContext) SpringApplication.run(NnpiaCv1Application.class, args);
//
//		MyController myController = context.getBean(MyController.class);
//
//		myController.sayHello();

		SpringApplication.run(NnpiaCv1Application.class, args);
	}

}
