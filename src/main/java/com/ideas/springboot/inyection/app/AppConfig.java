package com.ideas.springboot.inyection.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ideas.springboot.inyection.app.models.ItemFactura;
import com.ideas.springboot.inyection.app.models.Producto;

@Configuration
public class AppConfig {
	
	@Bean("iteamsFactura")
	public List<ItemFactura> registrarItems(){
		Producto producto1=new Producto("Camara Sony", 250);
		Producto producto2=new Producto("Bicicleta", 50);
		
		ItemFactura linea1= new ItemFactura(producto1, 10);
		ItemFactura linea2= new ItemFactura(producto2, 8);
		
		return Arrays.asList(linea1, linea2);
	}
	
	@Bean("iteamsFacturaOficina")
	public List<ItemFactura> registrarItemsOficina(){
		Producto producto1=new Producto("Monitor LG LCD 24''", 250);
		Producto producto2=new Producto("Notebool Asus", 500);
		Producto producto3=new Producto("Impresora HP", 80);
		Producto producto4=new Producto("Escritorio Oficina", 120);
		
		ItemFactura linea1= new ItemFactura(producto1, 10);
		ItemFactura linea2= new ItemFactura(producto2, 8);
		ItemFactura linea3= new ItemFactura(producto3, 14);
		ItemFactura linea4= new ItemFactura(producto4, 5);
		
		return Arrays.asList(linea1, linea2, linea3, linea4);
	}

}
