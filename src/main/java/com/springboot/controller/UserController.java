package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.repository.UserRepository;

@Controller
public class UserController {

	private UserRepository userRepository;
	
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@RequestMapping("/user")
	public String getUsers(Model model) {
		model.addAttribute("listUser",this.userRepository.findAll());
		return "user";
	}
	
	
}
