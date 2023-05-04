package com.examplesspring.apploginregisterusers.controllers;

import com.examplesspring.apploginregisterusers.dto.UserRegisterDTO;
import com.examplesspring.apploginregisterusers.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class UserRegisterController {
	private UserService userService;
	
	public UserRegisterController(UserService user) {
		this.userService = user;
	}
	
	@ModelAttribute("user")
	public UserRegisterDTO returnNewUserRegisterDTO () {
		return new UserRegisterDTO();
	}
	
	@GetMapping
	public String showRegisterForm () {
		return "register";
	}
	
	@PostMapping
	public String registerUserAccount (@ModelAttribute("user") UserRegisterDTO userRegisterDTO) {
		userService.save(userRegisterDTO);
		return "redirect/register?success";
	}
}
