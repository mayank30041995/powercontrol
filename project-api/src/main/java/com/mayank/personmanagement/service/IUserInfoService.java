package com.mayank.personmanagement.service;

import java.util.List;

import com.mayank.personmanagement.dao.*;

public interface IUserInfoService {

	List<UserInfo> getUserInfoList(int userId);

	UserInfo getUserInfoById(int id);

	void addUserInfo(UserInfo userInfo);

	void updateUserInfo(UserInfo userInfo);

	void deleteUserInfoById(int id);

	List<UserInfo> getAllUserInfo();

//	List<UserInfo> getUserInfoChildList(int childrenId);

	
	
}
