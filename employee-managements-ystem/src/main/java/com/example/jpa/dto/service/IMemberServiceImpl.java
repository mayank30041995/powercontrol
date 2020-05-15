package com.example.jpa.dto.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpa.dto.IMemberDAO;
import com.example.jpa.model.Member;

@Service
public class IMemberServiceImpl implements  IMemberService{
    
	@Autowired
	IMemberDAO daoRef;
	@Override
	public List<Member> getAllMember() {
		// TODO Auto-generated method stub
		return daoRef.findAll();
	}

	@Override
	public Member getMemberById(int memid) {
		// TODO Auto-generated method stub
		return daoRef.getOne(memid);
	}

	@Override
	public void addMember(Member member) {
		// TODO Auto-generated method stub
		daoRef.save(member);
	}

	@Override
	public void updateMember(Member member, int memid) {
		// TODO Auto-generated method stub
		daoRef.save(member);
	}

	@Override
	public void deleteMember(int memid) {
		// TODO Auto-generated method stub
		daoRef.deleteById(memid);
	}

	@Override
	public List<Member> getMemberByName(String name) {
		// TODO Auto-generated method stub
		return daoRef.getMemberByName(name);
	}

}
