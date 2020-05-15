package com.example.jpa.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.dto.service.IChildrenService;
import com.example.jpa.model.Children;
import com.example.jpa.model.Member;

@RestController
public class ChildrenController {
	
	@Autowired
	private IChildrenService servicechild;

	@RequestMapping(value="/member/{memid}/")
	public List<Children> getAllChildren(@PathVariable int memid) {
		System.out.println("in Children Controller");
		List<Children> childList = servicechild.getChildrenList(memid);
		System.out.println(childList);
		return childList;
	}
	
	@RequestMapping("/children")
	public List<Children> getChildrenList(){
		return servicechild.getAllChildren();
	}
		
	@RequestMapping("/member/{memid}/children/{childid}")
	public Children getChildrenById(@PathVariable int childid,@PathVariable int memid) {
		return servicechild.getChildrenById(memid);
	}

	@RequestMapping(method=RequestMethod.POST, value="/member/{memid}/children")
	public void addChildren(@RequestBody  Children child, @PathVariable int memid) {
		
		child.setMember(new Member(memid,""));
		servicechild.addChildren(child);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/member/{memid}/project/{childid}")
	public void updateChildren(@RequestBody Children child, @PathVariable int memid) {
		child.setMember(new Member(memid,""));
		servicechild.updateChild(child);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/children/{childid}")
	public void deleteChildrenById(@PathVariable int childid) {
		 servicechild.deleteChildrenById(childid);
	}
}