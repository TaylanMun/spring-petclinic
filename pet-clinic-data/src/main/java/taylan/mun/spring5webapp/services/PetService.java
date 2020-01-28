package taylan.mun.spring5webapp.services;

import taylan.mun.spring5webapp.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
