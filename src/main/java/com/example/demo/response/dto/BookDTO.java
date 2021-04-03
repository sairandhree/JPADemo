package com.example.demo.response.dto;

import java.util.List;

import javax.persistence.OneToMany;

import com.example.demo.entities.Author;
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
public class BookDTO {

	private String name;
	
	private Float price;
	
	private Integer numOFPages;

	private List<Author> authors;
}
