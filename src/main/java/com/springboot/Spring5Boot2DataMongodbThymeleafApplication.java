package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;//Usando o Context do Spring

import com.springboot.config.SpringContextTestController;

@SpringBootApplication
public class Spring5Boot2DataMongodbThymeleafApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring5Boot2DataMongodbThymeleafApplication.class, args);
		
		//Chamando uma Controller que está dentro do Contexto do Spring, pois o spring gerencia tudo atraves do seu container
		//Dentro de 'getBean' passar a convenção do container do spring onde ele gerencia nossas classes, q é primeira letra minuscula
		SpringContextTestController controllerContext = (SpringContextTestController) ctx.getBean("springContextTestController");
		controllerContext.testContextSpring();//Chamando método que pegamos do contexto
	}

}
