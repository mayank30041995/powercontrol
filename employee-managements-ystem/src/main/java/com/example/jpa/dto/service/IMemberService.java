package com.example.jpa.dto.service;

import java.util.List;


import com.example.jpa.model.Member;


public interface IMemberService {
	
	List<Member> getAllMember();

	Member getMemberById(int memid);

	void addMember(Member member);

	void updateMember(Member member, int memid);

	void deleteMember(int memid);

	List<Member> getMemberByName(String name);

}
