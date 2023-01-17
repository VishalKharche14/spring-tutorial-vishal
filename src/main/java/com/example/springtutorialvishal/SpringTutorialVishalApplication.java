package com.example.springtutorialvishal;

import com.example.springtutorialvishal.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringTutorialVishalApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringTutorialVishalApplication.class, args);

        MyController myController = (MyController) context.getBean("myController") ;
        System.out.println(myController.sayHello());

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController") ;
        System.out.println(constructorInjectedController.getGreeting());

        SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController") ;
        System.out.println(setterInjectedController.getGreeting());

        PropertyInjectedController propertyInjectedController  = (PropertyInjectedController) context.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        PetController petController = (PetController) context.getBean("petController") ;
        System.out.println(petController.bestPet());

        EnglishGreetingController englishGreetingController = (EnglishGreetingController) context.getBean("englishGreetingController");
        System.out.println(englishGreetingController.getGreeting());
    }

}
