package ar.edu.unq.po2.tp3;

public class Ejercicio3 {

	public int multiploComunHastaElMilEntre(int num1, int num2) {
			
		int dividiendoActual = 1000; 		
		
		while (dividiendoActual >= 0) {
			
			if( dividiendoActual % num1 == 0 && 
				dividiendoActual % num2 == 0	) {
				
				return dividiendoActual;
			}
			
			dividiendoActual--;
			
		}
		
		return -1;
		
		

	}



}