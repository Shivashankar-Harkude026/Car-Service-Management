package com.practice.csa.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.csa.RequestDto.UserRequest;
import com.practice.csa.ResponseDto.UserResponse;
import com.practice.csa.serviceImpl.UserServiceImpl;
import com.practice.csa.utility.ResponseStructure;


@RestController
public class UserControler {
	private final UserServiceImpl userServiceImpl;

	public UserControler(UserServiceImpl userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}
	
	@PostMapping("/user")
	public ResponseEntity<ResponseStructure<UserResponse>> registerUser(@RequestBody UserRequest userRequest){
		return userServiceImpl.registerUser(userRequest);
	}
	
	

}
