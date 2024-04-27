package ar.edu.unq.po2.tp6;

public class Propiedad {

	private String direccion;
	private int valorFiscal;
	private String descripcion;

	public Propiedad(String direccion, int valorFiscal, String descripcion) {
		this.setDireccion(direccion);
		this.valorFiscal = valorFiscal;
		this.setDescripcion(descripcion);
	}

	public double getValorFiscal() {

		return valorFiscal;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
