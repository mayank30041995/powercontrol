package com.mayank.personmanagement.dto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mayank.personmanagement.dao.Phone;

@Repository
public interface IPhoneDAO extends JpaRepository<Phone,Integer>{

	List<Phone> findByPersonPersonId(int phoneid);

}