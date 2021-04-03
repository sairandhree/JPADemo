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
public class Author {
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	private String email;
	
	@OneToMany (mappedBy = "authors")
	private List<Book> book;
}
