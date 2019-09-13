package guru.springframework.sfgspringpetclinic.services;

import java.util.Set;

import guru.springframework.sfgspringpetclinic.model.Owner;

public interface OwnerService {
	
	Owner findByLastName(String lastName);
	
	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll(); 
}
