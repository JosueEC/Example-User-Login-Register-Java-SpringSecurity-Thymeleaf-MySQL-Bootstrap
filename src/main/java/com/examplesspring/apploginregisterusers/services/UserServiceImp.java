package com.examplesspring.apploginregisterusers.services;

import com.examplesspring.apploginregisterusers.dto.UserRegisterDTO;
import com.examplesspring.apploginregisterusers.models.Rol;
import com.examplesspring.apploginregisterusers.models.User;
import com.examplesspring.apploginregisterusers.repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImp implements UserService{
	
	private UserRepository userRepository;
	
	public UserServiceImp(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public User save(UserRegisterDTO userRegisterDTO) {
		User user1 = new User(null, userRegisterDTO.getName(),
				userRegisterDTO.getLast_name(),
				userRegisterDTO.getEmail(),
				userRegisterDTO.getPassword(),
				Arrays.asList(new Rol("ROL_USER")));
		
		return userRepository.save(user1);
	}
}
