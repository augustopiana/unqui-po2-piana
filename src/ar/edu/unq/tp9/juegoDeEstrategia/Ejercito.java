package ar.edu.unq.tp9.juegoDeEstrategia;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp3.Point;

public class Ejercito extends Caracteres {

	private List<Caracteres> caracteres = new ArrayList<Caracteres>();

	public Ejercito(List<Caracteres> ejercito) {
		this.setCaracteres(ejercito);
	}

	public void setCaracteres(List<Caracteres> ejercito) {
		this.caracteres = ejercito;
	}

	public List<Caracteres> getEjercito() {
		return caracteres;
	}

	public void addCaracter(Caracteres caracter) {
		this.getEjercito().add(caracter);
	}

	public void eliminarCaracter(Caracteres caracter) {
		this.getEjercito().remove(caracter);
	}

	@Override
	public void caminar(Point punto) {
		this.caminar(punto);
		for (Caracteres c : this.getEjercito()) {
			c.caminar(punto);
		}
	}

}
