package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTestCase {

	Rectangulo rectangulo ;
	
	@BeforeEach
	void setUp() throws Exception {
		
		rectangulo = new Rectangulo();
	
	}

	@Test
	public void test1_UnRectanguloEsCreadoAPartirDe4Puntos() {
		
		Rectangulo rec = new Rectangulo();
		
		assertEquals(rec.getPunto1().getEjeX(),1);
		assertEquals(rec.getPunto1().getEjeY(),0);
			
		
	}

}
