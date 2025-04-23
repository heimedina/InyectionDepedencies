package com.ideas.springboot.inyection.app.services;

import org.springframework.stereotype.Service;

@Service("MiServicioComplejo")
public class MiServicioComplejo implements IServicio{

	@Override
	public String operacion() {
		return "ejecutando algun proceso...";
	}

	
}
