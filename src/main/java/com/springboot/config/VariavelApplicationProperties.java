package com.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class VariavelApplicationProperties implements ApplicationListener<ContextRefreshedEvent>{
	
	@Value("${var.context.geral.nome}")
	private String varApplicationProperties;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("Variavel do 'application.properties': " + varApplicationProperties);
	}

}
