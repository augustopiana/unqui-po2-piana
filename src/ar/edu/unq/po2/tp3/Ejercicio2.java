package ar.edu.unq.po2.tp3;

public class Ejercicio2 {

	public int numeroConMasDigitosPares(int[] arregloDeNumeros) {
		
		int numeroConMasDigitosPares = 0;
		int cantidadMaximaDigitosPares = 0;
		
		
		for (int num : arregloDeNumeros) {
			
			// Creo variables para guardar la cantidad actual de digitos pares, y la maxima guardada.
			
			int cantidadDigitosPares = contarDigitosPares(num);
			
			
			if (cantidadDigitosPares > cantidadMaximaDigitosPares) {
				cantidadMaximaDigitosPares = cantidadDigitosPares;
				numeroConMasDigitosPares = num;
			}		
			
		}
		
		return numeroConMasDigitosPares;
		
	}

	private int contarDigitosPares(int num) {
		
		int cantidadDigitosPares = 0;
		
		while (num != 0) {
			
			int digito = num % 10; // obtengo el ultimo digito
			if (digito % 2 ==  0) { // verifico si es par
				cantidadDigitosPares ++;		
				
			}
			num /= 10;
			
			
		}
		
		
		return cantidadDigitosPares;
		
	}

	
	
	
}
