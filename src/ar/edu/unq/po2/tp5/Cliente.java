package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	// ATRIBUTOS
	private List<Producto> productos = new ArrayList<Producto>();

	// METODOS

	public List<Producto> getProductosAdquiridos() {

		return productos;

	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;

	}

}
