package com.mayank.personmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mayank.personmanagement.dao.Person;
import com.mayank.personmanagement.dao.Phone;
import com.mayank.personmanagement.service.IPhoneService;

@RestController
public class PhoneController {

		@Autowired
		IPhoneService phoneServiceRef;
		
		@RequestMapping("person/{personId}/phone")
		public List<Phone> getAllPhones(@PathVariable int personId) {
			System.out.println("in Project Controller");
			List<Phone> phoneList = phoneServiceRef.getPhoneList(personId);
			System.out.println(phoneList);
			return phoneList;
		}
		
		@RequestMapping("/phone")
		public List<Phone> getPhoneList(){
			return phoneServiceRef.getAllPhone();
		}
			
		@RequestMapping("/person/{personid}/phone/{id}")
		public Phone getPhoneById(@PathVariable int id) {
			return phoneServiceRef.getPhoneById(id);
		}

		@RequestMapping(method=RequestMethod.POST, value="/person/{personId}/phone")
		public void addPhone(@RequestBody Phone phone, @PathVariable int personId) {
			
			phone.setPerson(new Person(personId,""));
			phoneServiceRef.addPhone(phone);
		}
		
		@RequestMapping(method=RequestMethod.PUT, value="/person/{personId}/phone/{id}")
		public void updatePhone(@RequestBody Phone phone, @PathVariable int personId) {
			phone.setPerson(new Person(personId,""));
			phoneServiceRef.updatePhone(phone);
		}
		
		@RequestMapping(method=RequestMethod.DELETE, value="/person/{id}")
		public void deletePhoneById(@PathVariable int id) {
			phoneServiceRef.deletePhoneId(id);
		}
}
