package ar.edu.unq.po2.tp5;

public abstract class Producto implements Pagable{

	// ATRIBUTOS
	protected String nombre;
	protected Double precio;
	
	// METODOS
	public Producto(String nombre, Double precio) {
		this.nombre = nombre;
		this.precio = precio;

	}
	
	public abstract Double getPrecio();

}
