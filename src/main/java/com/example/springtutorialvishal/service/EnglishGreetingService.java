package com.example.springtutorialvishal.service;

import com.example.springtutorialvishal.repositories.EnglishGreetingRepository;

public class EnglishGreetingService implements GreetingService {
    private final EnglishGreetingRepository englishGreetingRepository ;

    public EnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String greet() {
        return englishGreetingRepository.getGreeting() +" from English";
    }
}
