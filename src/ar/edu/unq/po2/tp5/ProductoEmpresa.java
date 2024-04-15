package ar.edu.unq.po2.tp5;

public class ProductoEmpresa extends Producto {

	public ProductoEmpresa(String nombre, Float precio) {
		super(nombre, precio);
		
	}

	@Override
	public Float getPrecio() {
		return this.precio;
	}

}
