package com.mayank.personmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayank.personmanagement.dao.UserInfo;
import com.mayank.personmanagement.dto.IUserInfoDAO;

@Service
public class UserInfoServiceImpl implements IUserInfoService{

	
	@Autowired
	private IUserInfoDAO daoRef;
	@Override
	public List<UserInfo> getUserInfoList(int personId) {
		// TODO Auto-generated method stub
		System.out.println("in Dao class UserClsss id"+personId);
		return daoRef.findByPersonPersonId(personId);
	}
//	@Override
//	public List<UserInfo> getUserInfoChildList(int childrenId) {
//		// TODO Auto-generated method stub
//		System.out.println("in Dao class UserClsss id"+childrenId);
//		return daoRef.findByChildrenChildrenId(childrenId);
//	}

	@Override
	public UserInfo getUserInfoById(int id) {
		// TODO Auto-generated method stub
		return daoRef.getOne(id);
	}

	@Override
	public void addUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		daoRef.save(userInfo);
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		daoRef.save(userInfo);
	}

	@Override
	public void deleteUserInfoById(int id) {
		// TODO Auto-generated method stub
		daoRef.deleteById(id);
	}

	@Override
	public List<UserInfo> getAllUserInfo() {
		// TODO Auto-generated method stub
		return daoRef.findAll();

	}

}
