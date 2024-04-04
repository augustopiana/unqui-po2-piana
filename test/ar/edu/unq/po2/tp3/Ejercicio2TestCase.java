package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Ejercicio2TestCase {

	public Ejercicio2 ej2 ;
	
	@BeforeEach
	public void setUp() {
					
		
		 ej2 = new Ejercicio2();	
		
	}
	
	
	@Test
	public void test1_NumeroConMayorCantidadDeDigitosPares(){
		
		int[] arregloDeNumeros = {123,456,426,11,14,16};
				
		int resultado = ej2.numeroConMasDigitosPares(arregloDeNumeros);
		
		assertEquals(426,resultado);
			
	
		
	}

		

	
	

}
