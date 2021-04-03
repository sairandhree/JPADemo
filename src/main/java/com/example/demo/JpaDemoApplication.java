package com.example.demo;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.apache.tomcat.util.digester.ArrayStack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Author;
import com.example.demo.entities.Book;
import com.example.demo.entities.User;
import com.example.demo.repo.AuthorRepo;
import com.example.demo.repo.BookRepo;
import com.example.demo.repo.UserRepo;

@SpringBootApplication
public class JpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	
//	@Autowired
//	UserRepo userRepo;
	
	@Autowired
	AuthorRepo authorRepo;
	
	@Autowired
	BookRepo bookRepo;
	
	@PostConstruct
	public void createUsers() {
		
		Author jkr = new Author();
		jkr.setName("jk rowling");
		jkr.setEmail("jkr@gmail.com");
		
		authorRepo.save(jkr);
		
		Author author2 = new Author();
		author2.setName("jk jr rowling");
		author2.setEmail("jkr2@gmail.com");
		
		authorRepo.save(author2);
		
		Book book1 = new Book();
		book1.setName("harry potter 1");
		book1.setNumOFPages(200);
		book1.setPrice(123F);
		book1.setAuthors( Arrays.asList(jkr,author2));
		
		bookRepo.save(book1);
		
//		Book book2 = new Book();
//		book2.setName("harry potter 2");
//		book2.setNumOFPages(200);
//		book2.setPrice(123F);
//		book2.setAuthors( Arrays.asList(jkr));
//		
//		bookRepo.save(book2);
		
		
	}
}
