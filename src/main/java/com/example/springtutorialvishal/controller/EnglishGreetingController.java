package com.example.springtutorialvishal.controller;

import com.example.springtutorialvishal.service.EnglishGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class EnglishGreetingController {
    private final EnglishGreetingService englishGreetingService ;

    public EnglishGreetingController(EnglishGreetingService englishGreetingService) {
        this.englishGreetingService = englishGreetingService;
    }

    public String getGreeting(){
        return englishGreetingService.greet() + " eng-greet-ctrl";
    }
}
