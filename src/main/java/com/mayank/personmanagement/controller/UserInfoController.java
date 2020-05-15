package com.mayank.personmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mayank.personmanagement.dao.Person;
import com.mayank.personmanagement.dao.UserInfo;
import com.mayank.personmanagement.service.IUserInfoService;

@RestController
public class UserInfoController {
	
	@Autowired
	private IUserInfoService serviceUser;
	
	@RequestMapping("person/{personId}/userinfo")
	public List<UserInfo> getAllUserInfos(@PathVariable int personId) {
		System.out.println("in user Controller");
		List<UserInfo> userList = serviceUser.getUserInfoList(personId);
		System.out.println(userList);
		return userList;
	}
	
//	@RequestMapping("person/{childrenId}/child/userinfo")
//	public List<UserInfo> getAllUserChildInfos(@PathVariable int childrenId) {
//		System.out.println("in user Controller");
//		List<UserInfo> userList = serviceUser.getUserInfoChildList(childrenId);
//		System.out.println(userList);
//		return userList;
//	}
	
	
	@RequestMapping("/userinfo")
	public List<UserInfo> getUserInfoList(){
		return serviceUser.getAllUserInfo();
	}
		
	@RequestMapping("/person/{personid}/userinfo/{id}")
	public UserInfo getuserinfoById(@PathVariable int id) {
		return serviceUser.getUserInfoById(id);
	}

	@RequestMapping(method=RequestMethod.POST, value="/person/{personId}/userinfo")
	public void addUserInfo(@RequestBody UserInfo userInfo, @PathVariable int personId) {
		userInfo.setPerson(new Person(personId,""));
		serviceUser.addUserInfo(userInfo);
	}
	
//	@RequestMapping(method=RequestMethod.POST, value="/person/{personId}/{childrenId}/userinfo")
//	public void addUserInfo(@RequestBody UserInfo userInfo, @PathVariable int personId,@PathVariable int childrenId) {
//		userInfo.setPerson(new Person(personId,"",""));
//		userInfo.setChildren(new Children(personId,"",' ',"",true,childrenId));
//
//		serviceUser.addUserInfo(userInfo);
//	}
	
	
	@RequestMapping(method=RequestMethod.PUT, value="/person/{personId}/userinfo/{id}")
	public void updateUserInfo(@RequestBody UserInfo userInfo, @PathVariable int personId) {
		userInfo.setPerson(new Person(personId,""));
		serviceUser.updateUserInfo(userInfo);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/userinfo/{id}")
	public void deleteChildrenById(@PathVariable int id) {
		serviceUser.deleteUserInfoById(id);
	}

}
