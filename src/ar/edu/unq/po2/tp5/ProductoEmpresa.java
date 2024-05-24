package ar.edu.unq.po2.tp5;

public class ProductoEmpresa extends Producto {

	public ProductoEmpresa(String nombre, double precio) {
		super(nombre, precio);
		
	}

	@Override
	public Double getPrecio() {
		return this.precio;
	}

	@Override
	public void registrarPago() {
		// avisarle al mercado que de debaja.
		
	}

}
