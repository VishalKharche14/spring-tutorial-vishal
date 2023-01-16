package com.example.springtutorialspets.service;

import org.springframework.stereotype.Service;

@Service
public class DogPetService implements PetService {
    @Override
    public String petType() {
        return "Dogs are the Best";
    }
}
