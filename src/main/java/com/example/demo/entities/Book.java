package com.example.demo.entities;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book {

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private Float price;
	
	private Integer numOFPages;
	
	
	@OneToMany 
	private List<Author> authors;
}
