package com.example.springtutorialvishal.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingService implements GreetingService {
    @Override
    public String greet() {
        return "Hello - from Constructor";
    }
}
