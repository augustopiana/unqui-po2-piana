package ar.edu.unq.po2.tp3;

import java.util.List;

public class Multioperador {

	public int sumarNumeros(List<Integer> numeros) {
		
		int sumaTotal = 0;
		
		
		for (int num : numeros) {
			sumaTotal = sumaTotal + num;
						
		}
		return sumaTotal;
		
		
	}

	
	public int restarNumeros(List<Integer> numeros) {
		
		int restaFinal = numeros.get(0);
		
		for (int i = 1 ; i < numeros.size() ; i ++) {
			
			restaFinal = restaFinal - numeros.get(i);			
			
		}
		return restaFinal;
		
		
	}
	
	

}
