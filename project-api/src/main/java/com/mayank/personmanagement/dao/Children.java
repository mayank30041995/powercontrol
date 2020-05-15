package com.mayank.personmanagement.dao;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Children{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int childrenId;
	private String childrenName;
	private char is_dependent;
	private String relationship;
	private Boolean is_adult;

	@ManyToOne
	private Person person;	
	public Children() {

	}

	public Children(int childrenId, String childrenName,char is_dependent,String relationship,Boolean is_adult,int personId) {
		super();
		this.childrenId = childrenId;
		this.childrenName = childrenName;
		this.is_dependent=is_dependent;
		this.relationship=relationship;
		this.is_adult=is_adult;
		this.person = new Person(personId,"");
	}

	public int getchildrenId() {
		return childrenId;
	}

	public void setchildrenId(int childrenId) {
		this.childrenId = childrenId;
	}

	public String getchildrenName() {
		return childrenName;
	}

	public void setchildrenName(String childrenName) {
		this.childrenName = childrenName;

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

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}


}
