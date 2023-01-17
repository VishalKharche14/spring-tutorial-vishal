package com.example.springtutorialvishal.service;

public class GreetingServiceFactory {
    public GreetingService getGreetingService(String type){
        return switch (type) {
            case "constructor" -> new ConstructorInjectedGreetingService();
            case "setter" -> new SetterInjectedGreetingService();
            case "property" -> new PropertyInjectedGreetingService();
            default -> new ConstructorInjectedGreetingService();
        };

    }
}
