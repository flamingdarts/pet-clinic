package com.dnpi.petclinic.dnpipetclinic.services;


import com.dnpi.petclinic.dnpipetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
