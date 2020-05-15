package com.mayank.personmanagement.service;

import java.util.List;

import com.mayank.personmanagement.dao.*;

public interface IChildrenService {

	List<Children> getChildrenList(int personId);

	Children getChildrenById(int id);

	void addChildren(Children proj);

	void updateChild(Children child);

	void deleteChildrenById(int id);

	List<Children> getAllChildren();
	
}