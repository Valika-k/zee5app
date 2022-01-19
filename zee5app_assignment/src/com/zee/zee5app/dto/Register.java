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
	

	//setter- to set the value for a particular field
	//getter- to get/return the value
}
