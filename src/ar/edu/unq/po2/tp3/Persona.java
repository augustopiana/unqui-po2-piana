package ar.edu.unq.po2.tp3;

import java.time.LocalDate;


public class Persona {

	private String nombre;
	private LocalDate fechaNac;
	private String apellido;

	public Persona(String nombre, String apellido, LocalDate fechaNac) {

		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.apellido = apellido;

	}

	public String getNombre() {

		return nombre;

	}

	public int getEdad() {

		int fechaActual = LocalDate.now().getYear();
		int anioNac = this.fechaNac.getYear();

		int edad = fechaActual - anioNac;

		return edad;

	}

	public Boolean menorQue(Persona persona) {

		Boolean resultado = this.getEdad() < persona.getEdad();

		return resultado;

	}

	public String getApellido() {
		
		return apellido;
		
	}
	
}
