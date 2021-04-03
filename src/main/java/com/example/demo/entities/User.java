package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	private String email;
	private String password;
	private Long phoneNumber;
	
	private Date dateCreated;
	private Date dateModified;
	private Date dateDeleted;
	private Date lastLoggedIn;
	
	
	public User(String name, String email, String password, Long phoneNumber) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}
	
	
	

}
