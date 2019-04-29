package com.springboot.config;

import org.springframework.stereotype.Controller;

@Controller
public class SpringContextTestController {

	//Método para ser chamado no contexto do spring como teste
	//Podemos chamar métodos, acessar oq quisermos, pois está dentro do Container do Spring
	public void testContextSpring() {
		System.out.println("Dentro do Método 'testContextSpring' da controller 'SpringContextTestController'.");
	}
}
