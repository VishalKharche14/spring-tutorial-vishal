package com.example.springtutorialvishal;

import com.example.springtutorialvishal.controller.PetController;
import com.example.springtutorialvishal.controller.ProfileInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.springtutorialvishal","com.example.springtutorialspets.service"})
public class SpringTutorialVishalApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringTutorialVishalApplication.class, args);

        ProfileInjectedController profileInjectedController = (ProfileInjectedController) context.getBean("profileInjectedController") ;
        System.out.println(profileInjectedController.getGreeting());

        PetController petController = (PetController) context.getBean("petController") ;
        System.out.println(petController.BestPet());


    }

}
