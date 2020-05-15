package com.mayank.personmanagement.dto;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;

import com.mayank.personmanagement.dao.Children;


public interface IChildrenDAO extends JpaRepository<Children, Integer>{

	

	List<Children> findByPersonPersonId(int personId);

}
