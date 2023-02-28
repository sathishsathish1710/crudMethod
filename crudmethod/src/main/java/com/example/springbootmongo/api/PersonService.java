package com.example.springbootmongo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	@Autowired
	private PersonRepository personRepository;
    
	
	public Person createPerson(Person person) {
		return personRepository.save(person);
	}
	
	public Person getByid(String id) {
		return personRepository.findById(id).orElse(null);
	}
	
	public Person updatePerson(String id,Person updatePerson) {
		return personRepository.findById(id).orElse(null);
	}
	
	public void  deletePerson(String id) {
		 personRepository.deleteById(id);
	}
}
