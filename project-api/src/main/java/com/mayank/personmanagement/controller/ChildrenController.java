package com.mayank.personmanagement.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mayank.personmanagement.dao.Children;
import com.mayank.personmanagement.dao.Person;
import com.mayank.personmanagement.service.IChildrenService;


@RestController
public class ChildrenController {

	@Autowired
	private IChildrenService serviceChild;

	
	@RequestMapping("person/{personId}/children")
	public List<Children> getAllChildrens(@PathVariable int personId) {
		System.out.println("in Project Controller");
		List<Children> childList = serviceChild.getChildrenList(personId);
		System.out.println(childList);
		return childList;
	}
	
	@RequestMapping("/childerns")
	public List<Children> getChildrenList(){
		return serviceChild.getAllChildren();
	}
		
	@RequestMapping("/person/{personid}/children/{id}")
	public Children getChildrenById(@PathVariable int id) {
		return serviceChild.getChildrenById(id);
	}

	@RequestMapping(method=RequestMethod.POST, value="/person/{personId}/children")
	public void addChildren(@RequestBody Children child, @PathVariable int personId) {
		child.setPerson(new Person(personId,""));
		serviceChild.addChildren(child);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/person/{personId}/children/{id}")
	public void updateChildren(@RequestBody Children child, @PathVariable int personId) {
		child.setPerson(new Person(personId,""));
		serviceChild.updateChild(child);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/children/{id}")
	public void deleteChildrenById(@PathVariable int id) {
		 serviceChild.deleteChildrenById(id);
	}
}