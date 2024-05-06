package ar.edu.unq.po2.tp8;

public abstract class Empleado {

	public final double sueldoFinal() {

		double sueldo = this.sueldo(); // calculo sueldo basico con horas y extra por hijos.

		sueldo = sueldo - this.descuentosDeAportes(); // le resto al sueldo los aportes.
		
		return sueldo;
		
	}

	public double descuentosDeAportes() {

		return this.sueldo() * 0.13;

	}

	public abstract double sueldo();

	public double sueldoBasico() {
		return 0;
	}
	
	
}
