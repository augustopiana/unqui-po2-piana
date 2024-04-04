package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTestCase {

	Point point ;
	
	@BeforeEach
	void setUp() throws Exception {
		
		point = new Point();
		
		
	}

	@Test
	public void test1_UnPointPuedeSerCreadoEnUnEjeXeY() {
		
		Point point = new Point(10,15);
		int ejex = 10;
		int ejey = 15;
		
		
		assertEquals(ejex , 10);
		assertEquals(ejey, 15);
		
		
	}

	@Test
	public void test2_UnPointPuedeSerCreadoPorDefecto() {
							
		assertEquals(point.getEjeX(),0);
		assertEquals(point.getEjeY(),0);
		
		
	}
	
	@Test
	public void test3_UnPointPuedeSerMovidoAOtraPosicion() {
		
		point.reubicarseEn(10,20) ;
		
		assertEquals(point.getEjeX(),10);
		assertEquals(point.getEjeY(),20);
		
		
		
	}

	@Test
	public void test4_UnPointPuedeSumarseConOtroPoint() {
		
		Point point1 = new Point(10,10);
		Point nuevoPoint = point1.sumarseCon(point);
		
		assertEquals(nuevoPoint.getEjeX(),10);
		assertEquals(nuevoPoint.getEjeY(),10);
		
		
	}
	
	
}


