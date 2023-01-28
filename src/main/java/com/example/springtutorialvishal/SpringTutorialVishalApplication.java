package com.example.springtutorialvishal;

import com.example.springtutorialvishal.controller.ConstructorInjectedController;
import com.example.springtutorialvishal.controller.PropertyInjectedController;
import com.example.springtutorialvishal.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringTutorialVishalApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringTutorialVishalApplication.class, args);

        System.out.println("========================= Constructor-Injected-Controller ===============================");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController") ;
        System.out.println(constructorInjectedController.getGreeting());

        System.out.println("========================= Setter-Injected-Controller ===============================");
        SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController") ;
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("========================= Property-Injected-Controller ===============================");
        PropertyInjectedController propertyInjectedController  = (PropertyInjectedController) context.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting()+"\n");

        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("as we have not mentioned qualifier on property injected controller,"+
                "\nand also there are more than 1 implementation of a service interface. \n"+
                "Spring-Boot will choose the implementation which is marked as {PRIMARY} \n"+
                "Here, we have marked Constructor Injected Service as Primary.");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
    }

}
