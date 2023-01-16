package com.example.springtutorialspets.service;

public class CatPetService implements PetService {
    @Override
    public String petType() {
        return "Cats are the Best";
    }
}
