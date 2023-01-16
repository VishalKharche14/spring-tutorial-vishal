package com.example.springtutorialvishal.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("EN")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String greet() {
        return "Hello-English";
    }
}
