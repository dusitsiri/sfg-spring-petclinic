package guru.springframework.sfgspringpetclinic.services;

import java.util.Set;

import guru.springframework.sfgspringpetclinic.model.Vet;

public interface VetService {

	Vet findById(Long Id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();
	
}
