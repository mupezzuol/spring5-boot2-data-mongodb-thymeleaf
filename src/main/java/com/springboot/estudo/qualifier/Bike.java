package com.springboot.estudo.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Utilizo component para pegar no context do spring
@Component
@Qualifier("bikeBeanQualifier")
public class Bike implements Vehicle{

	@Override
	public void start() {
		System.out.println("Ligando a Bike. @Qualifier -> bikeBeanQualifier");
	}

	@Override
	public void stop() {
		System.out.println("Parando a Bike. @Qualifier -> bikeBeanQualifier");
	}

}
