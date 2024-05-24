package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja {

	// ATRIBUTOS

	private Mercado mercadoDePertencia;
	private List<Producto> productosRegistrados = new ArrayList<Producto>();

	// METODOS

	public  Caja(Mercado unMercado) {
		this.mercadoDePertencia = unMercado;
		
	}

	public List<Producto> getProductosRegistrados() {
		return productosRegistrados;

	}

	public void registrarProductosDe(Cliente unCliente) {
		mercadoDePertencia.darDeBajaStock(unCliente.getProductosAdquiridos());  // Le avisamos al mercado que de debaja
																			    // en stock la lista de productos
																				// adquiridos del cliente.

		this.setProductosRegistrados(unCliente.getProductosAdquiridos()); // Registramos productos en la caja

	}

	private void setProductosRegistrados(List<Producto> productosRegistrados) {

		this.productosRegistrados = productosRegistrados;
	}

	public Double montoTotalProductosRegistrados() {
		double montoTotalProductos = productosRegistrados.stream()
											             .mapToDouble(p -> p.getPrecio())
	                                                     .sum();
		
		return montoTotalProductos;
	}

}
