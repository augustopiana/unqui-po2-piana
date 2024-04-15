package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto {

	public ProductoCooperativa(String nombre, Float precio) {
		super(nombre, precio);

	}

	@Override
	public Float getPrecio() {
			Float precioConDescuento = (this.precio * 10) / 100;
		return precioConDescuento;
	}

}
