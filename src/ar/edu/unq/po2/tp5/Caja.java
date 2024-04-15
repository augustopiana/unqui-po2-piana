package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja {

	// ATRIBUTOS

	private Mercado mercadoDePertencia;
	private List<Producto> productosRegistrados = new ArrayList<Producto>();

	// METODOS

	public void setMercadoDePertencia(Mercado unMercado) {
		this.mercadoDePertencia = unMercado;

	}

	public List<Producto> getProductosRegistrados() {
		return productosRegistrados;

	}

	public void registrarProductosDe(Cliente unCliente) {
		mercadoDePertencia.darDeBajaStock(unCliente.getProductosAdquiridos()); // Le avisamos al mercado que de debaja
																				// en stock la lista de productos
																				// adquiridos del cliente.

		this.setProductosRegistrados(unCliente.getProductosAdquiridos()); // Registramos productos en la caja

	}

	private void setProductosRegistrados(List<Producto> productosRegistrados) {

		this.productosRegistrados = productosRegistrados;
	}

	public Float montoTotalProductosRegistrados() {
		float montoAPagar = 0.0f;
		for (Producto prod : this.productosRegistrados) {
			montoAPagar = montoAPagar + prod.getPrecio();
		}
		return montoAPagar;
	}

}
