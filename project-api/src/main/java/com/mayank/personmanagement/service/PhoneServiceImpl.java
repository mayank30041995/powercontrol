package com.mayank.personmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayank.personmanagement.dao.Phone;
import com.mayank.personmanagement.dao.UserInfo;
import com.mayank.personmanagement.dto.IPhoneDAO;

@Service
public class PhoneServiceImpl implements IPhoneService{
   
	@Autowired
	private IPhoneDAO daoRef;
	
	@Override
	public List<Phone> getPhoneList(int personid) {
		// TODO Auto-generated method stub
		System.out.println("in Dao class UserClsss id"+personid);
		return daoRef.findByPersonPersonId(personid);
	}
	@Override
	public List<Phone> getAllPhone() {
		// TODO Auto-generated method stub
		return daoRef.findAll();
	}

	@Override
	public Phone getPhoneById(int phoneid) {
		// TODO Auto-generated method stub
		return daoRef.getOne(phoneid);
	}

	@Override
	public void addPhone(Phone phone) {
		// TODO Auto-generated method stub
		daoRef.save(phone);
	}

	@Override
	public void updatePhone(Phone phone) {
		// TODO Auto-generated method stub
		daoRef.save(phone);
	}

	@Override
	public void deletePhoneId(int phoneid) {
		// TODO Auto-generated method stub
		daoRef.deleteById(phoneid);
	}


}
