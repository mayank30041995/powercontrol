package com.example.jpa;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MemberManagementAPI {
	
	public static void main(String [] args) {
	     
		SpringApplication.run(MemberManagementAPI.class,args);
//		sudo kill -9 $(sudo lsof -t -i:8080)

	}
}
