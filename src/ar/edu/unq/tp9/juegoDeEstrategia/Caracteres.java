package ar.edu.unq.tp9.juegoDeEstrategia;

import ar.edu.unq.po2.tp3.Point;

public abstract class Caracteres {

	private Point ubicacion;
	
	public abstract void caminar(Point punto);
	
	public void setUbicacion(Point nuevaUbicacion) {
		this.ubicacion = nuevaUbicacion;
	}
	
	public Point getUbicacion() {
		return ubicacion;
	}
	
	public int getX() {
		return (this.getUbicacion().getEjeX());
	}
	
	public int getY() {
		return (this.getUbicacion().getEjeY());
	}
	
	
	
}
