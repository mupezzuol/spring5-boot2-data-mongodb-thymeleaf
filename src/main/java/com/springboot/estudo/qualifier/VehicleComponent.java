package com.springboot.estudo.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleComponent {

	@Autowired
	@Qualifier("carBeanQualifier")
	private Vehicle vehicle;
	
	
	//Chamo os métodos da interface, porém quem irá implementar???? Uso o @Qualifier para setar quem irá executar
	public void service() {
		vehicle.start();
		vehicle.stop();
	}
	
	
}
