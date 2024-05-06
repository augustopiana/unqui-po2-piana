package ar.edu.unq.po2.tp8;

public class EmpleadoPlanta extends Empleado{
	
	private int cantHijos;
	
	public EmpleadoPlanta(int cantHijos) {
		super();
		this.cantHijos = cantHijos;
	}

	
	public int getCantHijos() {
		return cantHijos;
	}
	
	@Override
	public double sueldo() {
		return sueldoBasico() + bonoPorHijo();
	}

	@Override
	public double sueldoBasico() {
		return 3000;
	}


	private int bonoPorHijo() {
		return 150 * cantHijos;
	}

}
