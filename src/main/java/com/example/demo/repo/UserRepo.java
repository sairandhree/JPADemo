package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.User;

public interface  UserRepo extends JpaRepository<User, Long> {

}
