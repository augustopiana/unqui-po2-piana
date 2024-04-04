package ar.edu.unq.po2.tp3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CounterTestCase {

	private Counter counter;

	@BeforeEach
	public void setUp() throws Exception {

		// Se crea el contador

		counter = new Counter();

		counter.agregarNumero(1);
		counter.agregarNumero(3);
		counter.agregarNumero(5);
		counter.agregarNumero(7);
		counter.agregarNumero(9);
		counter.agregarNumero(1);
		counter.agregarNumero(1);
		counter.agregarNumero(1);
		counter.agregarNumero(1);
		counter.agregarNumero(4);
		
		
		

	}

	@Test
	public void test1_CantidadNumerosPares() {

		int cantidadNumerosPares = counter.cantidadNumerosPares(counter.getNumeros());

		assertEquals(cantidadNumerosPares, 1);

	}

	@Test
	public void test2_CantidadNumerosImpares() {

		int cantidadNumerosImpares = counter.cantidadNumerosImpares(counter.getNumeros());

		assertEquals(cantidadNumerosImpares, 9);

	}

	@Test
	public void test3_CantidadMultiplosDeUnNumeroEspecifico() {
		
		int cantidadDeMultiplos = counter.cantidadDeMultiplosDel(2,counter.getNumeros());
			
		
		assertEquals(cantidadDeMultiplos, 1);
		

	}
		
	
}
