package com.example.springtutorialvishal.service;


public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String greet() {
        return "Hello-Property";
    }
}
