package com.example.springtutorialvishal.service;

public class ConstructorInjectedGreetingService implements GreetingService {
    @Override
    public String greet() {
        return "Hello-Constructor";
    }
}
