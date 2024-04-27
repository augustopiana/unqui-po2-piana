package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTest {

	Banco banco;
	Cliente cliente1;
	Propiedad falucho1234;
	CreditoPersonal creditoPAceptado;
	CreditoPersonal creditoPDenegado;
	CreditoHipotecario creditoHAceptado;
	CreditoHipotecario creditoHDenegado;

	@BeforeEach
	void setUp() throws Exception {

		// Creo instancias.
		banco = new Banco("Comafi");

		falucho1234 = new Propiedad("Falucho 1234", 250000, "Casona antigua con parque grande");

		cliente1 = new Cliente("Simon", "Piana", 20, 20000.00, banco, falucho1234);

		creditoPAceptado = new CreditoPersonal(cliente1, 13000, 12); 
		creditoPDenegado = new CreditoPersonal(cliente1, 14000, 12);
		creditoHAceptado = new CreditoHipotecario(cliente1, 9999.00, 12, cliente1.getPropiedad());
		creditoHDenegado = new CreditoHipotecario(cliente1, 12000.00, 12, cliente1.getPropiedad());

	}

	@Test
	void test1_UnBancoNuevoNoTieneClientes() {
		assertEquals(banco.getClientes().size(), 0);
	}

	@Test
	void test2_UnBancoNuevoNoTieneSolicitudesDeCredito() {
		assertEquals(banco.getSolicitudesCredito().size(), 0);
	}

	@Test
	void test3_UnBancoPuedeRegistrarClientes() {
		banco.setCliente(cliente1);
		assertEquals(banco.getClientes().size(), 1);

	}

	@Test
	void test4_UnClientePuedeSolicitarleUnCreditoaPersonaAlBanco() {
		cliente1.solicitarCreditoPersonalDe(500.00);
		assertEquals(banco.getSolicitudesCredito().size(), 1);

	}

	@Test
	void test5_UnClientePuedeSolicitarleUnCreditoaHipotecarioAlBanco() {
		cliente1.solicitarCreditoHipotecarioDe(700.00);
		assertEquals(banco.getSolicitudesCredito().size(), 1);

	}

	@Test
	void test6_UnClienteSabeSusIngresosAnuales() {
		assertEquals(cliente1.getSueldoNetoAnual(), 240000.00);
	}

	@Test
	void test7_UnCreditoPersonalIndicaSiEsAceptado() {
		assertTrue(creditoPAceptado.esAceptable());
		assertFalse(creditoPDenegado.esAceptable());
	}

	@Test
	void test8_UnCreditoHipotecarioIndicaSiEsAceptado() {
		assertTrue(creditoHAceptado.esAceptable());
		assertFalse(creditoHDenegado.esAceptable());
	}

	@Test
	void test9_UnCreditoHipotecarioEsDenegadoSiElClienteNoCumpleConLaEdad() {

		Cliente cliente2 = new Cliente("Jose", "Piana", 64, 20000.00, banco, falucho1234);
		CreditoHipotecario creditoHDenegadoPorEdad = new CreditoHipotecario(cliente2, 12000.00, 12,
				cliente2.getPropiedad());

		assertFalse(creditoHDenegadoPorEdad.esAceptable());
	}

	@Test
	void test10_UnBancoSabeElMontoTotalDeDineroADesembolsar() {
		cliente1.solicitarCreditoHipotecarioDe(9999.00);
		cliente1.solicitarCreditoPersonalDe(13000.00);
		assertEquals(22999.00,banco.montoTotalDeDineroADesembolsar());
	}
}
