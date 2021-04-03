package com.example.demo.request.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserRequestDTO {
	
	private String name; 
	private String email;
	private String password;
	private Long phoneNumber;
	//private Adress address; 

}
