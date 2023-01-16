package com.example.springtutorialvishal;

import com.example.springtutorialvishal.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringTutorialVishalApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringTutorialVishalApplication.class, args);
        MyController myController = (MyController) context.getBean("myController") ;
        System.out.println(myController.sayHello());
    }

}
