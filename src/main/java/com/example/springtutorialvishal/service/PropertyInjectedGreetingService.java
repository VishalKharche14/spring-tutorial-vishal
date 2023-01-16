package com.example.springtutorialvishal.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String greet() {
        return "Hello-Property";
    }
}
