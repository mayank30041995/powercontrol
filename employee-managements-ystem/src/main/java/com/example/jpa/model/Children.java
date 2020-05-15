package com.example.jpa.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Children {

	@Id
	@GeneratedValue
	private int childid;
	private char is_dependent;
	private String relationship;
	private Boolean is_adult;
    
	@ManyToOne
	private Member member;


	public Children() {
		// TODO Auto-generated constructor stub
	}

	public Children(int childid, char is_dependent, String relationship, Boolean is_adult, int memid) {
		super();
		this.childid = childid;
		this.is_dependent = is_dependent;
		this.relationship = relationship;
		this.is_adult = is_adult;
		this.member = new Member(memid,"");
	}
	public int getId() {
		return childid;
	}

	public void setId(int childid) {
		this.childid = childid;
	}

	public char getIs_dependent() {
		return is_dependent;
	}

	public void setIs_dependent(char is_dependent) {
		this.is_dependent = is_dependent;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public Boolean getIs_adult() {
		return is_adult;
	}

	public void setIs_adult(Boolean is_adult) {
		this.is_adult = is_adult;
	}
    
	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	

}
