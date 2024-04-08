package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SupermercadoTestCase {

	Supermercado dia;
	List<Producto> productos1 = new ArrayList<Producto>();
	Producto leche;
	Producto agua;
	Producto queso;

	@BeforeEach
	void setUp() throws Exception {

		leche = new Producto(200.00, "Leche", true,50);
		agua = new Producto(500.00, "Agua", false);
		queso = new Producto(1000.00, "Queso", false);

		productos1.add(leche);
		productos1.add(agua);
		productos1.add(queso);

		dia = new Supermercado("Dia", "Lamadrid 141", productos1);

	}

	@Test
	void test1_UnSupermercadoNuevoTieneUnNombreUnaDirYProductos() {

		assertEquals("Dia", dia.getNombreSuper());
		assertEquals("Lamadrid 141", dia.getDirSuper());
		assertEquals(productos1.getFirst(), dia.getProductos().getFirst());

	}

	@Test
	void test2_UnSupermercadoSabeLaCantidadDeProductosQueTiene() {

		assertEquals(3, dia.cantProductos());

	}
	
	@Test
	void test3_UnSupermercadoSabeElPrecioTotalDeSusProductos () {
		
		assertEquals(1600.00, dia.precioTotalProductos());
		
		
	}
	

}




















