package com.example.jpa.dto;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.model.Children;
import com.example.jpa.model.Member;


public interface IMemberDAO extends JpaRepository<Member, Integer>{

	

	List<Member> getMemberByName(String name);

}
