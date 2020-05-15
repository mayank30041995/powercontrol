package com.example.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.dto.service.IMemberService;
import com.example.jpa.model.Member;

@RestController
public class MemberController {
	@Autowired
	IMemberService memberservice;
	
	@RequestMapping("/welcome")
	public String welcomeMember() {
		return "Hello Member";
	}
	
	@RequestMapping("/member")
	public List<Member> getAllMember(){
		return memberservice.getAllMember();
	}
	
	@RequestMapping("/members/memid}")
	public Member getMemberById(@PathVariable int memid) {
		return memberservice.getMemberById(memid);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/member")
	public void addMember(@RequestBody Member Member) {
		memberservice.addMember(Member);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/member/{memid}")
	public void updateMember(@RequestBody Member Member, @PathVariable int memid) {
		memberservice.updateMember(Member,memid);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/member/{memid}")
	public void deleteMember(@PathVariable int memid) {
		memberservice.deleteMember(memid);
	}
	
	@RequestMapping("/member/member/{name}")
	public List<Member> getMemberByName(@PathVariable String name) {
		return memberservice.getMemberByName(name);
	}
	
}


