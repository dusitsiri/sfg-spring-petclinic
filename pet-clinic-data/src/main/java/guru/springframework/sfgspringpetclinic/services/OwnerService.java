package guru.springframework.sfgspringpetclinic.services;

import java.util.Set;

import guru.springframework.sfgspringpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
	
	Owner findByLastName(String lastName);
}
