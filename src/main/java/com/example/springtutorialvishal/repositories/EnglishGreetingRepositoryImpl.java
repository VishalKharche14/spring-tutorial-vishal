package com.example.springtutorialvishal.repositories;
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getGreeting() {
        return "Hello-Repository";
    }
}
