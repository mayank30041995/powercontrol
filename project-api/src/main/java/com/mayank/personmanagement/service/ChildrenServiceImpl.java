package com.mayank.personmanagement.service;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayank.exception.PersonNotFoundException;
import com.mayank.personmanagement.dao.Children;
import com.mayank.personmanagement.dto.*;


@Service
public class ChildrenServiceImpl implements IChildrenService{

	@Autowired
	private IChildrenDAO daoRef;

	@Override
	public List<Children> getChildrenList(int personId) {
		// TODO Auto-generated method stub
		System.out.println("in Dao class person id"+personId);
		return daoRef.findByPersonPersonId(personId);
	}

	@Override
	public Children getChildrenById(int id) {
		// TODO Auto-generated method stub
		return daoRef.findById(id).orElseThrow(() -> new PersonNotFoundException(id));
	}

	@Override
	public void addChildren(Children child) {
		// TODO Auto-generated method stub
		daoRef.save(child);
	}

	@Override
	public void updateChild(Children child) {
		// TODO Auto-generated method stub
		daoRef.save(child);
	}

	@Override
	public void deleteChildrenById(int id) {
		// TODO Auto-generated method stub
		daoRef.deleteById(id);
	}

	@Override
	public List<Children> getAllChildren() {
		
		return daoRef.findAll();
	}
	
}