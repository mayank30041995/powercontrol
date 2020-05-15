package com.mayank.personmanagement.service;

import java.util.List;


import java.util.Optional;

import com.mayank.personmanagement.dao.Person;

public interface IPersonService {

	List<Person> getAllPerson();

	Person getPersonById(int personId);

	void addPerson(Person person);

	Person updatePerson(Person person, int personId);

	void deletePerson(int personId);

	List<Person> getPersonByDept(String deptId);

}
