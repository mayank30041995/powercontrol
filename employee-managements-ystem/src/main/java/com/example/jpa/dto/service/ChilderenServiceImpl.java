package com.example.jpa.dto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpa.dto.IChildrenDAO;
import com.example.jpa.model.Children;
import com.example.jpa.model.Member;

@Service
public class  ChilderenServiceImpl implements IChildrenService{
	
	@Autowired
	private IChildrenDAO daoRef;
	
	@Override
	public List<Children> getChildrenList(int memid) {
		// TODO Auto-generated method stub
		System.out.println("in Dao class employee id"+memid);
		return daoRef.findById(memid);
	}
	
	@Override
	public Children getChildrenById(int childid) {
		// TODO Auto-generated method stub
		return daoRef.getOne(childid);
	}

	@Override
	public void addChildren(Children child) {
		// TODO Auto-generated method stub
		
		daoRef.save(child);
	}

	@Override
	public void deleteChildrenById(int childid) {
		// TODO Auto-generated method stub
		daoRef.deleteById(childid);
	}

	@Override
	public List<Children> getAllChildren() {
		// TODO Auto-generated method stub
		return daoRef.findAll();
	}

	@Override
	public void updateChild(Children child) {
		// TODO Auto-generated method stub
		daoRef.save(child);
	}
    



}
