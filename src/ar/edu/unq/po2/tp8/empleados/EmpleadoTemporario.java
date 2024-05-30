package ar.edu.unq.po2.tp8.empleados;

public class EmpleadoTemporario extends Empleado {

	private int horasTrabajadas;
	private boolean tieneHijos;
	private boolean estaCasado;

	public EmpleadoTemporario(int horasTrabajadas, boolean tieneHijos, boolean estaCasado) {

		this.horasTrabajadas = horasTrabajadas;
		this.tieneHijos = tieneHijos;
		this.estaCasado = estaCasado;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public boolean isTieneHijos() {
		return tieneHijos;
	}

	public void setTieneHijos(boolean tieneHijos) {
		this.tieneHijos = tieneHijos;
	}

	public boolean isEstaCasado() {
		return estaCasado;
	}

	public void setEstaCasado(boolean estaCasado) {
		this.estaCasado = estaCasado;
	}

	@Override
	public double sueldo() {

		return 5 * this.getHorasTrabajadas() + this.sueldoBasico() + this.bonoFamiliar();

	}

	private int bonoFamiliar() {
		int resultado = 0;
		if (this.estaCasado || this.tieneHijos) {
			resultado = 100;
		}
		return resultado;
	}

	@Override
	public double sueldoBasico() {
		return 1000;
	}
	
}
