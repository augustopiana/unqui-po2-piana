package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Mercado {

	// ATRIBUTOS
	private List<Producto> stock = new ArrayList<Producto>();
	
	
	// METODOS
	public void setStock(List<Producto> productos) {
		this.stock.addAll(productos);
	}

	public void darDeBajaStock(List<Producto> list) {
		for (Pagable prod: list) {
			
			this.darDeBajaProducto(prod);
			
		}
	}

	private void darDeBajaProducto(Pagable prod) {
		this.stock.remove(prod);	
		
	}

}
