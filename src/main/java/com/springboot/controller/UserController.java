package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.entity.User;
import com.springboot.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/user")
	public String getUsers(Model model) {
		model.addAttribute("listUser",this.userService.listarTodos());
		return "user";
	}
	
	
	
	
	//##### GET and POST com Thymeleaf
	//URL para requisição GET
	@GetMapping("/userForm")
	public String getUser(Model model) {
		model.addAttribute("user", new User());//Levo para minha página de formulário um Objeto zerado
		return "userForm";// Página userForm.html
	}
	
	//URL para requisição POST
	//No método GET eu envio para o FORM do Thymeleaf um usuário novo que é preenchido de acordo com oq o usuário preenche na tela
	//Utilizo o '@ModelAttribute' para eu conseguir resgatar esse atributo e levar ele adiante para outra tela
	//Na tela 'userFormResult' eu consigo utiliar o EL para acessar meu objeto perfeitamente
	@PostMapping("/userForm")
	public String userSubmit(@ModelAttribute User user) {
		return "userFormResult";
	}
	
	
}
