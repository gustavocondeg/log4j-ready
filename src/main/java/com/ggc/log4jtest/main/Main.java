package com.ggc.log4jtest.main;

import java.util.Date;


import org.apache.log4j.Logger;

import com.ggc.log4jtest.model.Persona;


public class Main {

	private static Logger log = Logger.getLogger(Main.class);
	
	public static void main(String[] args){
		log.info("Primer prueba, cadena simple...");
		separarCadenas("EL PREMIO COMIENZA Y TERMINA CON LOS MISMOS CARACTERES");
		log.info("---------------separador------------------");
		
		log.info("Segunda prueba, cadena con un enter...");
		separarCadenas("EL PREMIO COMIENZA Y TERMINA\n CON LOS MISMOS CARACTERES");
		log.info("---------------separador------------------");
		
		log.info("Tercer prueba, cadena con dos enter...");
		separarCadenas("EL PREMIO COMIENZA\n Y TERMINA CON LOS\n MISMOS CARACTERES");
		log.info("---------------separador------------------");
		
		log.info("Cuarta prueba, enter rush...");
		separarCadenas("EL\n PREMIO\n COMIENZA\n Y\n TERMINA\n CON\n LOS\n MISMOS\n CARACTERES\n");
		log.info("---------------separador------------------");
	}
	
	public static void separarCadenas(String value){
		String line = new String();
		for(int i=0; i<value.length(); i++){
			if(value.charAt(i)!='\n'){
				line = line + value.charAt(i);
			}else{ 
				log.info("Imprimo linea: " + line);
				line = "";
			}
		}
		if(!line.equals("")){
			log.info("Imprimo ultima linea: " + line);
		}
		
		
	}
	
	public static void main_2(String[] args) {
		String[] argus = {"5","6","7"};
		if(args==null){
			generarLogsAlPedo(argus);
		}else{
			generarLogsAlPedo(args);
		}
		
	}
	
	public static void generarLogsAlPedo(String[] args){
		
		Integer cantidadDeIteraciones;
		try{
			cantidadDeIteraciones = Integer.parseInt(args[1]);
			if(cantidadDeIteraciones<=0){
				throw new Exception();
			}
		}catch(Exception e){
			cantidadDeIteraciones = 1;
		}
		
		for(Integer i = 0; i<cantidadDeIteraciones; i++){
			log.info("Esto es un mensaje de info " + new Date());
			log.warn("Esto es un mensaje de warn " + new Date());
			log.error("Esto es un mensaje de error " + new Date());
			log.debug("Esto es un mensaje de debug " + new Date());
			log.fatal("Esto es un mensaje de fatal " + new Date());
		}
		
	}
	
	public static void main_001(String[] args){
		Persona p = new Persona();
		p.setApellido("Conde");
		p.setFechaNacimiento(new Date());
		p.setIdPersona(7951);
		p.setNombre("Beto");
		
		log.info( p.toString() );
	}

}
