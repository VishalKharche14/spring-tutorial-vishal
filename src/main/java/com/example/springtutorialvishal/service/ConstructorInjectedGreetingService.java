package com.example.springtutorialvishal.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class ConstructorInjectedGreetingService implements GreetingService {
    @Override
    public String greet() {
        return "Hello - from Constructor";
    }
}
