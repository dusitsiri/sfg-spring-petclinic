package guru.springframework.sfgspringpetclinic.services;

import java.util.Set;

import guru.springframework.sfgspringpetclinic.model.Pet;

public interface PetService {

	Pet findById(Long Id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll(); 
}
