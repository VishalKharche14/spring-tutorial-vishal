package com.example.springtutorialvishal.config;

import com.example.springtutorialspets.service.CatPetService;
import com.example.springtutorialspets.service.DogPetService;
import com.example.springtutorialvishal.service.ConstructorInjectedGreetingService;
import com.example.springtutorialvishal.service.PropertyInjectedGreetingService;
import com.example.springtutorialvishal.service.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GreetingServiceConfig {
    @Bean
    ConstructorInjectedGreetingService constructorInjectedGreetingService(){
        return new ConstructorInjectedGreetingService() ;
    }
    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService() ;
    }
    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService() ;
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
