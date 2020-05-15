package com.example.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Member {
    @Id
    @GeneratedValue
	private int memid;
	private String name;
	
	public Member() {
		
	}
	
	public Member(int memid, String name) {
		super();
		this.memid = memid;
		this.name = name;
	}
	public int getId() {
		return memid;
	}
	public void setId(int memid) {
		this.memid = memid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
