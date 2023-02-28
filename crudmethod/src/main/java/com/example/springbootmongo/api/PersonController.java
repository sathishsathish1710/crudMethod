package com.example.springbootmongo.api;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonController {
	
	private static Logger log=LogManager.getLogger(PersonController.class);
	
	
	  @Autowired
	    private PersonService personService;

	    @PostMapping("/person")
	   public String createPerson(@RequestBody Person person) {
	    	log.info("created by person" +person.getId());
	    	 
	    	return "person created";
	    }

	    @GetMapping("/person/{id}")
	    public String getById(@RequestBody String id) {
	    	log.info("getting by person" +id);
	    	return "person getting";
		
		
	    }

	    @PutMapping("/person/{id}")
	    public String updatePerson(@RequestBody String id,@RequestBody Person person) {
	    	person.setId(id);
	    
	    	log.info("created by person" +person.getId());
	    	return "person updated";
	    }

	    @DeleteMapping("/person/{id}")
	    public String deleteperson(@RequestBody String id) {
	    	log.info("deleted the person"+id);
	    	return "person deleted";
	}
}


