package ar.edu.unq.po2.tp8;

public class EmpleadoPasante extends Empleado {

	private int horasTrabajadas;
	
	public EmpleadoPasante(int horasTrabajadas) {
		super();
		this.horasTrabajadas = horasTrabajadas;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	@Override
	public double sueldo() {
		return this.horasTrabajadas * 40;
	}
}
