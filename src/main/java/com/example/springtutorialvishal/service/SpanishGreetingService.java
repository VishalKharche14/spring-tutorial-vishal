package com.example.springtutorialvishal.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"ES","default"})
public class SpanishGreetingService implements GreetingService {
    @Override
    public String greet() {
        return "Hello-Spanish";
    }
}
