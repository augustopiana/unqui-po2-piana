package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Mercado {

	// ATRIBUTOS
	private List<Producto> stock = new ArrayList<Producto>();
	
	
	// METODOS

	public void setStock(List<Producto> nuevoStock) {
		this.stock.addAll(nuevoStock);
	}

	public void darDeBajaStock(List<Producto> productosDadosDeBaja) {
		for (Producto prod: productosDadosDeBaja) {
			
			this.darDeBajaProducto(prod);
			
		}
	}

	private void darDeBajaProducto(Producto prod) {
		this.stock.remove(prod);
		
	}

}
