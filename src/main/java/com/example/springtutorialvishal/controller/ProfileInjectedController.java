package com.example.springtutorialvishal.controller;

import com.example.springtutorialvishal.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ProfileInjectedController {
    private final GreetingService greetingService ;

    public ProfileInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.greet()+" from Profile" ;
    }

}
