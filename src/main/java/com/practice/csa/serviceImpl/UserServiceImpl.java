package com.practice.csa.serviceImpl;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.practice.csa.Mapper.UserMapper;
import com.practice.csa.RequestDto.UserRequest;
import com.practice.csa.ResponseDto.UserResponse;
import com.practice.csa.repository.UserRepository;
import com.practice.csa.service.UserService;
import com.practice.csa.utility.ResponseStructure;

@Service
public class UserServiceImpl implements UserService{
	
	
	private final UserRepository userRepository;
	private final UserMapper userMapper;

	
	public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
		this.userRepository = userRepository;
		this.userMapper = userMapper;
	}
	
	@Override
	public ResponseEntity<ResponseStructure<UserResponse>> registerUser(UserRequest userRequest){
		return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseStructure<UserResponse>()
				.setStatusCode(HttpStatus.CREATED.value())
				.setMessage("User Object Created Succesfully..")
				.setData(userMapper.mapToUserResponse(userRepository.save(userMapper.mapToUser(userRequest)))));
		
		
	}
	
	
	

}
