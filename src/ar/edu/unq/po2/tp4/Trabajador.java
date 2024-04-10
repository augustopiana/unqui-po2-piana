package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {

	private Integer montoImponible;
	private List<Ingreso> ingresosPercibidos = new ArrayList<Ingreso>();

	public Trabajador(int montoImponible, List<Ingreso> ingresos) {

		this.setMontoImponible(montoImponible);
		this.setIngresos(ingresos);

	}

	public void setIngresos(List<Ingreso> ingresos) {
		this.ingresosPercibidos = ingresos;

	}

	public void setMontoImponible(int montoImponible) {

		this.montoImponible = montoImponible;

	}

	public Integer getMontoTotalPercibido() {

		int montoTotalPercibido = 0;
		for (Ingreso ingreso : ingresosPercibidos) {

			montoTotalPercibido = montoTotalPercibido + ingreso.getMontoPercibido();

		}

		return montoTotalPercibido;

	}

	public Integer getImpuestoAPagar() {

		int montoTotalDeImpuseto = 0;
		for (Ingreso ingreso : ingresosPercibidos) {
			montoTotalDeImpuseto = montoTotalDeImpuseto + ingreso.getMontoImponible();

		}

		return montoTotalDeImpuseto;
	}

	public Integer getMontoImponible() {
		int montoImponible = this.getMontoTotalPercibido();
		return montoImponible;
	}

}
