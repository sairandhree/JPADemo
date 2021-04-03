package com.example.demo.response.dto;

import java.util.List;

import javax.persistence.OneToMany;

import com.example.demo.entities.Book;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class AuthorDTO {

	
	private String name;
	private String email;
	
	private List<Book> book;
}
