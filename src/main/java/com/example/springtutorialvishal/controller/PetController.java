package com.example.springtutorialvishal.controller;

import com.example.springtutorialspets.service.PetService;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {
    private final PetService petService ;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String bestPet(){
        return petService.petType() ;
    }
}
