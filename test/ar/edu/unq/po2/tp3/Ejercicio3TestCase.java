package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Ejercicio3TestCase {
	
	public Ejercicio3 ej3 ;
	
	
	@BeforeEach
	void setUp() {
		
		ej3 = new Ejercicio3();
		
		
	}
	

	@Test
	void test1_multiploComunHastaElMilEntre() {
		
		int numero1 = 3 ;
		int numero2 = 9 ;
		
		int multiploComun = ej3.multiploComunHastaElMilEntre(numero1,numero2);
		
		assertEquals(999,multiploComun);
		
		
		
		
	}

}
