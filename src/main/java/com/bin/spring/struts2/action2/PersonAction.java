package com.bin.spring.struts2.action2;

import com.bin.spring.struts2.services.PersonService;

public class PersonAction {

	private PersonService personService ;
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	
	public String execute(){
		personService.save();
		System.out.println("execute...");
		return "success" ;
	}
}
