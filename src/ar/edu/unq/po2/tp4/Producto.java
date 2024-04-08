package ar.edu.unq.po2.tp4;

public class Producto {

	private Double precio;
	private String nombre;
	private Boolean esCuidado;
	private Integer descuento;

	// Constructor para producto sin descuento
	public Producto(double precio, String nombre, boolean booleano) {
		this.setPrecio(precio);
		this.setNombre(nombre);
		this.setEsCuidado(booleano);

	}

	// Constructor para producto con descuento
	public Producto(double precio, String nombre, boolean booleano, int descuento) {
		this.setPrecio(precio);
		this.setNombre(nombre);
		this.setEsCuidado(booleano);
		this.setDescuento(descuento);

	}

	public String getNombre() {
		return nombre;
	}

	public Integer getDescuento() {
		return descuento;
	}

	public Double getPrecio() {

		Double precio = this.precio;
		if (esCuidado) {

			precio = (precio * this.getDescuento()) / 100;

		}

		return precio;

	}

	public Boolean getEsCuidado() {
		return esCuidado;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEsCuidado(Boolean esCuidado) {
		this.esCuidado = esCuidado;
	}

	public void setDescuento(Integer descuento) {
		this.descuento = descuento;

	}

}
