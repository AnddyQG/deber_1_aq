package com.example.demo.tradicional;

public class Cliente {

	private String nombres;
	private String cedula;
	
	//getters and setters
	protected String getNombres() {
		return nombres;
	}
	protected void setNombres(String nombres) {
		this.nombres = nombres;
	}
	protected String getCedula() {
		return cedula;
	}
	protected void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	@Override
	public String toString() {
		return "Cliente [nombres=" + nombres + ", cedula=" + cedula + "]";
	}
	
	
	
}
