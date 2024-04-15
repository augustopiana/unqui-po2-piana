package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	// ATRIBUTOS

	private List<Producto> productosAdquiridos = new ArrayList<Producto>();

	// METODOS

	public List<Producto> getProductosAdquiridos() {

		return productosAdquiridos;

	}

	public void setProducto(List<Producto> productos) {
		this.productosAdquiridos = productos;

	}

}
