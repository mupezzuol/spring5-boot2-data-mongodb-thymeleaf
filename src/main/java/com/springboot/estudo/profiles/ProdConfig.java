package com.springboot.estudo.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//Ao chamar o profile no properties da aplicação, ele encontra esse configuration que tem o profile com o nome selecionado no properties
//@Configuration sempre é executado antes de tudo, até mesmo do contexto, pois é onde setamos configs do nosso container da aplicação
@Configuration // -> Tag de configuração utilizando profile, será chamado todos os Beans dessa classe, pois foi setado a classe com o profile 'prod'
@Profile("prod")
public class ProdConfig {
	
	@Bean
	public BeanProd beanProd() {
		return new BeanProd();
	}
	
}
