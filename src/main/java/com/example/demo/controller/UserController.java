package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.repo.UserRepo;
import com.example.demo.request.dto.UserRequestDTO;
import com.example.demo.response.dto.UserResponseDTO;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@GetMapping("/")
	public List<UserResponseDTO> getUsers(){
		
		return userService.getUsers();
		
	}
	
	
	@PostMapping("/")
	public String createUser(@RequestBody UserRequestDTO user) {
		userService.createUser(user);		
		return "user is created";
	}
}
