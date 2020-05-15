package com.mayank.personmanagement.dto;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mayank.personmanagement.dao.Person;

@Repository
public interface IPersonDAO extends JpaRepository<Person,Integer>{
	
	List<Person> findByDeptName(String deptName);

	//
	
}
