package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repo.UserRepo;
import com.example.demo.request.dto.UserRequestDTO;
import com.example.demo.response.dto.UserResponseDTO;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;
	
	
	
	public List<UserResponseDTO> getUsers(){
		
		List<UserResponseDTO>  users = new ArrayList();
		
		ModelMapper modelMapper = new ModelMapper();
	
		 userRepo.findAll().forEach(user -> {
			
			 users.add(modelMapper.map(user, UserResponseDTO.class));
		 });
		 
		
//		for (User user : userRepo.findAll()) {
//			UserDTO userdto = new UserDTO();
//			userdto.setEmail(user.getEmail());
//			userdto.setName(user.getName());
//			
//			userdto.setPhoneNumber(user.getPhoneNumber());
//			
//			users.add(userdto)
//			;
//		}
		 return users;
		 
	}



	public void createUser(UserRequestDTO userRequestDTO) {
		// TODO Auto-generated method stub
		
		ModelMapper modelMapper = new ModelMapper();
		
		User user = modelMapper.map(userRequestDTO, User.class);
				
		userRepo.save(user);
	}

}
