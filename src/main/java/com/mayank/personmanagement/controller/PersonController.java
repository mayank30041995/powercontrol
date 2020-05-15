package com.mayank.personmanagement.controller;

import java.util.Arrays;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mayank.personmanagement.dao.Person;
import com.mayank.personmanagement.service.IPersonService;

@RestController
public class PersonController {

	@Autowired
	IPersonService personServiceRef;
	
	@RequestMapping("/welcome")
	public String welcomeEmployeee() {
		return "Hello Employee";
	}
	
	@RequestMapping("/person")
	public List<Person> getAllEmployees(){
		return personServiceRef.getAllPerson();
	}
	
	@RequestMapping("/person/{personId}")
	public Person getPersonById(@PathVariable int personId) {
		return personServiceRef.getPersonById(personId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/person")
	public void addPerson(@RequestBody Person person) {
		personServiceRef.addPerson(person);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/person/{personId}")
	public Person updatePerson(@RequestBody Person person, @PathVariable int personId) {
		return personServiceRef.updatePerson(person,personId);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/person/{personId}")
	public void deletePerson(@PathVariable int personId) {
		personServiceRef.deletePerson(personId);
	}
	
	@RequestMapping("/person/dept/{personName}")
	public List<Person> getEmployeeByDept(@PathVariable String deptName) {
		return personServiceRef.getPersonByDept(deptName);
	}
	
	
}