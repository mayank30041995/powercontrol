package com.example.jpa.dto.service;
import java.util.List;

import com.example.jpa.model.Member;
import com.example.jpa.model.Children;


public interface IChildrenService {

	

	Children getChildrenById(int childid);

	void addChildren(Children child);


	void deleteChildrenById(int childid);

	List<Children> getAllChildren();

	void updateChild(Children child);

	List<Children> getChildrenList(int memid);

	
	
	


	
}