package com.mayank.personmanagement.service;
import java.util.List;

import com.mayank.personmanagement.dao.Phone;

public interface IPhoneService {


	List<Phone> getPhoneList(int phoneid); 
	
	List<Phone> getAllPhone();

	Phone getPhoneById(int phoneid);

	void addPhone(Phone phone);

	void updatePhone(Phone phone);

	void deletePhoneId(int phoneid);

    

	

}
