package com.ideas.springboot.inyection.app.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("MiServicioPrincipal")
@Primary
public class MiServicio implements IServicio{

	@Override
	public String operacion() {
		return "ejecutando algun proceso...";
	}

	
}
