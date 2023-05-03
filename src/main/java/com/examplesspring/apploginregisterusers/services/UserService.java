package com.examplesspring.apploginregisterusers.services;

import com.examplesspring.apploginregisterusers.dto.UserRegisterDTO;
import com.examplesspring.apploginregisterusers.models.User;

public interface UserService {
	public User save (UserRegisterDTO userRegisterDTO);
}
