package com.example.demoh2.controller;

import com.example.demoh2.entity.Cat;
import com.example.demoh2.entity.Dog;
import com.example.demoh2.entity.Pet;
import com.example.demoh2.entity.Snake;
import com.example.demoh2.repo.PetRepo;
import com.example.demoh2.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@org.springframework.stereotype.Controller
public class Controller {

  PetService petService;
  @Autowired
public Controller(PetService petService) {
  this.petService = petService;
}


  @GetMapping("")
  public String save() {
    petService.init();
    return "OK";
  }
}
