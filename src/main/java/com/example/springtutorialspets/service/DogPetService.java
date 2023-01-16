package com.example.springtutorialspets.service;

public class DogPetService implements PetService {
    @Override
    public String petType() {
        return "Dogs are the Best";
    }
}
