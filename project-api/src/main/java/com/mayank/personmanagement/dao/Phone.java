package com.mayank.personmanagement.dao;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Phone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int phoneid;
	private long phone_number;
	private String email;
	private String communication_address;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "personId", nullable = false)
	private Person person;
	
	public Phone() {
		
	}
	public Phone(int phoneid, long phone_number, String email, String communication_address, int personId) {
		super();
		this.phoneid = phoneid;
		this.phone_number = phone_number;
		this.email = email;
		this.communication_address = communication_address;
		this.person = new Person(personId,"");
	}
	
	
	public int getPhoneid() {
		return phoneid;
	}
	public void setPhoneid(int phoneid) {
		this.phoneid = phoneid;
	}
	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCommunication_address() {
		return communication_address;
	}
	public void setCommunication_address(String communication_address) {
		this.communication_address = communication_address;
	}
    
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
}
