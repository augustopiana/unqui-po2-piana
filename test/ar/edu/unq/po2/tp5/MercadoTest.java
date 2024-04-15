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
		//Creo instancias
		caja1 = new Caja();
		
		mercadoCentral = new Mercado();
		
		leche = new ProductoEmpresa("Leche",300.0f);
		carne = new ProductoEmpresa("Carne",1300.0f);
		lechuga = new ProductoCooperativa("Lechuga",200.0f);
		tomate = new ProductoCooperativa("Toamte ",500.0f);
		papa = new ProductoCooperativa("Papa ",800.0f);
			
		augusto = new Cliente();
		
		//Le asigno el mercado de pertenencia a la caja
		caja1.setMercadoDePertencia(mercadoCentral);

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
		
		assertEquals(caja1.getProductosRegistrados(),augusto.getProductosAdquiridos());
		
	}

	@Test
	void test2_UnaCajaDevuelveElMontoAPagarDelCliente() {
		caja1.registrarProductosDe(augusto);
		
		assertEquals(2950.0f,caja1.montoTotalProductosRegistrados());
		
		
	}
	
	
}
