package com.example.demoh2.repo;

import com.example.demoh2.entity.Pet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PetRepo extends JpaRepository<Pet, Integer> {

}
