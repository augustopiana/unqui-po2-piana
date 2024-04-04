package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {

	EquipoDeTrabajo unq;
	Persona augusto;
	Persona melli;
	Persona nahue;
	Persona joaco;
	Persona nacho;

	@BeforeEach
	void setUp() throws Exception {

		augusto = new Persona("Augusto", "Piana", LocalDate.of(2004, 5, 24));
		nahue = new Persona("Nahuel", "Giaminelli", LocalDate.of(2002, 10, 10));
		melli = new Persona("Tomas", "Neira", LocalDate.of(2003, 5, 10));
		joaco = new Persona("Joaquin", "Rodriguez", LocalDate.of(2000, 5, 10));
		nacho = new Persona("Igancio", "Ferro", LocalDate.of(2003, 5, 10));
		
		Persona[] companieros = { augusto, nahue, melli, joaco, nacho};

		unq = new EquipoDeTrabajo("UNQ", companieros);

	}

	@Test
	void test1_UnEquipoDeTrabajoTieneUnNombre() {

		assertEquals("UNQ", unq.getNombre());

	}

	@Test

	void test2_UnEquipoDeTrabajoSabeElPromedioDeEdadDeSusIntegrantes() {

		assertEquals(21, unq.promedioEdadIntegrantes());

	}

}
