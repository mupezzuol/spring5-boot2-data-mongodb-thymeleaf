package com.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.User;

@RestController
public class HttpMethodController {
	
	
	//Método GET passando Parametro na URL
	@RequestMapping(value="/http/{nome}", method = RequestMethod.GET)
	public List<User> getUsers(@PathVariable String nome) {
		List<User> users = new ArrayList<>();
		
		User user1 = new User("Usuário 1","user1@gmail.com");
		User user2 = new User(nome,nome+"@gmail.com");
		
		users.add(user1);
		users.add(user2);
		return users;
	}
	
	
	
	
	
}
