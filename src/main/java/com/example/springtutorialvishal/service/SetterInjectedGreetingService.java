package com.example.springtutorialvishal.service;
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String greet() {
        return "Hello-Setter";
    }
}
