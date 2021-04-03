package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Author;


public interface  AuthorRepo extends JpaRepository<Author, Long> {

}
