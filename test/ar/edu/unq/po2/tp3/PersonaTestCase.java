package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


class PersonaTestCase {

	Persona augusto;
	Persona ernestina;

	@BeforeEach
	void setUp() throws Exception {

		augusto = new Persona("Augusto","Piana" , LocalDate.of(2004, 5, 24));
		ernestina = new Persona("Ernestina", "Piana", LocalDate.of(2009, 10, 8));

	}

	@Test
	void test1_UnaPersonaTieneUnNombreYUnaFechaDeNac() {

		assertEquals(augusto.getNombre(), "Augusto");
		assertEquals(augusto.getEdad(), 20);

	}
	
	@Test
	void test2_UnaPersonaSePuedeSaberSiEsMenorAOtra() {

		Boolean resultado = ernestina.menorQue(augusto);

		assertTrue(resultado);

	}

}