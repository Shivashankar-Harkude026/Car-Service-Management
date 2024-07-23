package com.practice.csa.service;

import org.springframework.http.ResponseEntity;

import com.practice.csa.RequestDto.UserRequest;
import com.practice.csa.ResponseDto.UserResponse;
import com.practice.csa.utility.ResponseStructure;

public interface UserService {
	
	ResponseEntity<ResponseStructure<UserResponse>> registerUser(UserRequest userRequest);
	

}
