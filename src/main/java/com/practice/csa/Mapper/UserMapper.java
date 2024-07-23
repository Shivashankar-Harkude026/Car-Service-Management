package com.practice.csa.Mapper;

import org.springframework.stereotype.Component;

import com.practice.csa.RequestDto.UserRequest;
import com.practice.csa.ResponseDto.UserResponse;
import com.practice.csa.entity.User;

@Component
public class UserMapper {
	
	public User mapToUser(UserRequest us) {
		
		User user = new User();
		user.setName(us.getName());
		user.setEmail(us.getEmail());
		user.setPassword(us.getPassword());
		return user;
		
	}
	
	public UserResponse mapToUserResponse(User user) {
		
		UserResponse sd = new UserResponse();
		sd.setId(user.getId());
		sd.setName(user.getName());
		sd.setEmail(user.getEmail());
		sd.setUserRole(user.getUserRole());
		
		return sd;
		
	}

}
