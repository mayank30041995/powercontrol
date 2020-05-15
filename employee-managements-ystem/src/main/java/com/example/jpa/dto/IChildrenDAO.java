package com.example.jpa.dto;


import java.util.Collection;


import java.util.List;

import javax.persistence.criteria.From;

import org.hibernate.type.TrueFalseType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.jpa.model.Children;

public interface IChildrenDAO extends JpaRepository<Children, Integer>{

	//List<Children> findById(int memid);
	//List<Children> findById(int memid);
      
	//@Query(value = "SELECT * FROM Children memid")
	//List<Children> findAllUsers(Children child);

//	@Query(value= "SELECT * FROM Children c  where c.member_memid = memid",nativeQuery = true)
//	List<Children> findByMembermemId(int memid);
	@Query(value = "SELECT * FROM Children  WHERE memid = memid",
            nativeQuery=true
    )
    public List<Children> findById(int memid);
	

//	 @Query(value = "SELECT c FROM Children c WHERE c.memid=:memid")
//	 public List<Children> findKids(@Param("memid") int memid);

}
