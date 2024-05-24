package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto {

	// METODOS
	public ProductoCooperativa(String nombre, double precio) {
		super(nombre, precio);

	}

	@Override
	public Double getPrecio() {
			Double precioConDescuento = this.precio * 0.9;
		return precioConDescuento;
	}

	@Override
	public void registrarPago() {
		// avisarle al mercado que me de debaja.
		
	}

}
