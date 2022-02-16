package com.mouritech.springbootsecurityrestexample.payload;

import lombok.Data;

@Data
public class LoginDto {
	
	private String usernameorEmail;
	private String password;
	public String getUsernameorEmail() {
		return usernameorEmail;
	}
	public String getPassword() {
		return password;
	}

}
