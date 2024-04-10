package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {

	Trabajador augusto;
	List<Ingreso> ingresos = new ArrayList<Ingreso>();
	Ingreso salario;
	Ingreso alquileres;
	IngresoHorasExtras extra;
	
	@BeforeEach
	void setUp() throws Exception {
		
		salario =  new Ingreso(4,"Salario",4000);
		alquileres = new Ingreso(4,"Alquileres",2000);
		extra	=	new IngresoHorasExtras(4,"Horas Extras",1500,5);
		
		
		ingresos.add(salario);
		ingresos.add(alquileres);
		ingresos.add(extra);
		
		augusto = new Trabajador(0,ingresos);
		
	}
		

	@Test
	void test1_UnTrabajadorSabeLaCantidadTotalQuePercibe() {
		
		assertEquals(7500,augusto.getMontoTotalPercibido());
		
	}
	
	@Test
		void test2_UnTrabajadorSabeLaCantidadTotalDeMontoImponibleQuePercibe() {
		
		assertEquals(7500,augusto.getMontoImponible());
		
	}
	
	
	@Test
	void test3_UnTrabajadorSabeLaCantidadTotalDeImpuestosQuePaga() {
	
		assertEquals(120,augusto.getImpuestoAPagar());
	
	}

}
