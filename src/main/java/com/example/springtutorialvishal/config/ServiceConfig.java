package com.example.springtutorialvishal.config;

import com.example.springtutorialspets.service.CatPetService;
import com.example.springtutorialspets.service.DogPetService;
import com.example.springtutorialvishal.repositories.EnglishGreetingRepository;
import com.example.springtutorialvishal.repositories.EnglishGreetingRepositoryImpl;
import com.example.springtutorialvishal.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ServiceConfig {
    @Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }
    @Bean
    EnglishGreetingService englishGreetingService(EnglishGreetingRepository englishGreetingRepository){
        return new EnglishGreetingService(englishGreetingRepository) ;
    }

    @Bean
    GreetingServiceFactory greetingServiceFactory(){
        return new GreetingServiceFactory() ;
    }
    @Bean
    GreetingService constructorInjectedGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.getGreetingService("constructor") ;
    }
    @Bean
    GreetingService propertyInjectedGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.getGreetingService("property") ;
    }
    @Bean
    GreetingService setterInjectedGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.getGreetingService("setter") ;
    }
    @Bean
//    @Primary
//    @Profile("dog")
    DogPetService dogPetService(){
        return new DogPetService() ;
    }
    @Bean
    @Primary
//    @Profile("cat")
    CatPetService catPetService(){
        return new CatPetService() ;
    }
}
