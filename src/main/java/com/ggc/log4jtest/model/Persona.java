package com.ggc.log4jtest.model;
import java.lang.reflect.Field;
import java.util.Date;


public class Persona {

	private Integer idPersona;
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	
	public Integer getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}	 
	
	@Override
	public String toString(){
		StringBuffer response = new StringBuffer();
		Class<?> c = this.getClass();
		Field[] fields = c.getDeclaredFields();
		for(Field f : fields){
			response.append("[" + f.getName() + ":........]\n");
			//f.get
		}
		
		return response.toString();
	}
	
	
	
	
	
	
	
	
	
	
	

}
