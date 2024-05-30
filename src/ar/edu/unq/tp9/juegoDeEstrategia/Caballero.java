package ar.edu.unq.tp9.juegoDeEstrategia;

import ar.edu.unq.po2.tp3.Point;

public class Caballero extends Caracteres{

	@Override
	public void caminar(Point punto) {
		this.setUbicacion(punto);
		
	}

}
