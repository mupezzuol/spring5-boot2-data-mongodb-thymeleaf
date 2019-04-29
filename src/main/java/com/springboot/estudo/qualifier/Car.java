package com.springboot.estudo.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Utilizo component para pegar no context do spring
@Component
@Qualifier("carBeanQualifier")
public class Car implements Vehicle{

	@Override
	public void start() {
		System.out.println("Ligando o Carro. @Qualifier -> carBeanQualifier");
	}

	@Override
	public void stop() {
		System.out.println("Parando o Carro. @Qualifier -> carBeanQualifier");
	}

}
