package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MercadoTest {

	Mercado mercadoCentral;

	Caja caja1;

	ProductoEmpresa leche;
	ProductoEmpresa carne;
	ProductoCooperativa papa;
	ProductoCooperativa tomate;
	ProductoCooperativa lechuga;

	Cliente augusto;

	List<Producto> productos = new ArrayList<Producto>();

	@BeforeEach
	void setUp() throws Exception {
		// Creo instancias
		mercadoCentral = new Mercado();
		
		caja1 = new Caja(mercadoCentral);


		leche = new ProductoEmpresa("Leche", 300.00);
		carne = new ProductoEmpresa("Carne", 1300.00);
		lechuga = new ProductoCooperativa("Lechuga", 200.00); // precio final $180
		tomate = new ProductoCooperativa("Toamte ", 500.00); // pf $450
		papa = new ProductoCooperativa("Papa ", 800.00);	//	pf $720

		augusto = new Cliente();

		// Agrego productos a la lista.
		productos.add(leche);
		productos.add(carne);
		productos.add(lechuga);
		productos.add(tomate);
		productos.add(papa);

		// Agrego productos a stock
		mercadoCentral.setStock(productos);

		// El cliente adquiere productos
		augusto.setProducto(productos);

	}

	@Test
	void test1_UnaCajaRegistraLosProductosQueTieneElCliente() {

		caja1.registrarProductosDe(augusto);

		assertEquals(caja1.getProductosRegistrados(), augusto.getProductosAdquiridos());

	}

	@Test
	void test2_UnaCajaDevuelveElMontoAPagarDelCliente() {
		caja1.registrarProductosDe(augusto);

		assertEquals(2950.00, caja1.montoTotalProductosRegistrados());

	}

}
