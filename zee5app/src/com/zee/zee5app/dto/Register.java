package com.zee.zee5app.dto;

import lombok.Data;

@Data
public class Register {
	 
	private String id;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String aadharCard;
	
	public Register()
	{
		//EDC
		//customization during the initialization of object 
		//then its better to introduce edc or pc 
		
		System.out.println("hello ");
	}
	
	//setter- to set the value for a particular field
	//getter- to get/return the value
}
