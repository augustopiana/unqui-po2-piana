package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTestCase {
	
	
	Multioperador multioperador ;
	private List<Integer> numeros = new ArrayList<Integer>();

	@BeforeEach
	public void setUp() {
	
		multioperador = new Multioperador();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(0);
		
	
	}
	
	
	@Test
	public void test1_UnMultioperadoPuedeSumarTodosLosNumerosDeUnArray(){
		
		int resultado = multioperador.sumarNumeros(numeros);
		
		assertEquals(resultado,3);
		
		
	}

	@Test
	public void test2_UnMultioperadorPuedeRestarTodosLosNumerosDeUnArray() {
		
		int resultado = multioperador.restarNumeros(numeros);
		
		assertEquals(resultado,-1);
		
		
	}
	
	

}
