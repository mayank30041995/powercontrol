package com.mayank.personmanagement.dao;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personId;
	public String deptName;
	
	  @OneToOne(fetch = FetchType.LAZY,
	            cascade =  CascadeType.ALL,
	            mappedBy = "person")
    private Phone phone;
	  

	public Person() {
		
	}
	
	public Person(int personId, String deptName) {
		super();
		this.personId = personId;
		this.deptName = deptName;
		
	}
	public int getpersonId() {
		return personId;
	}
	public void setEmpId(int personId) {
		this.personId = personId;
	}

	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	

}
 