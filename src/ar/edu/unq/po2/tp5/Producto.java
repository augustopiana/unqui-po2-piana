package ar.edu.unq.po2.tp5;

public abstract class Producto {

	protected String nombre;
	protected Float precio;
	

	public Producto(String nombre, Float precio) {
		this.nombre = nombre;
		this.precio = precio;

	}
	
	public abstract Float getPrecio();

}
