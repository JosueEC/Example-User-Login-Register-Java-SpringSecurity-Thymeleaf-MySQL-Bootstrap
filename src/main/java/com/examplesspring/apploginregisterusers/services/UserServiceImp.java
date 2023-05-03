package com.examplesspring.apploginregisterusers.services;

import com.examplesspring.apploginregisterusers.dto.UserRegisterDTO;
import com.examplesspring.apploginregisterusers.models.User;
import com.examplesspring.apploginregisterusers.repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User save(UserRegisterDTO userRegisterDTO) {
		return null;
	}
}
