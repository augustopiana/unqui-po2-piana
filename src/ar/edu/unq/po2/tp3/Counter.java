package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {

	// Declaro lista de numeros.

	private List<Integer> numeros = new ArrayList<Integer>();

	public List<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(List<Integer> numeros) {
		this.numeros = numeros;
	}

	public void agregarNumero(int numero) {

		numeros.add(numero);

	}

	public int cantidadNumerosPares(List<Integer> listaDeNumeros) {

		int contadorNumerosPares = 0;

		for (int num : listaDeNumeros) {

			if (num % 2 == 0) {

				contadorNumerosPares = contadorNumerosPares + 1;

			}

		}

		return contadorNumerosPares;

	}

	
	public int cantidadNumerosImpares(List<Integer> listaDeNumeros) {
		
		int contadorNumerosImpares = 0;
		
		for (int num : listaDeNumeros ) {
			
			if (num % 2 != 0 )
				
				contadorNumerosImpares = contadorNumerosImpares + 1;
			
		}
		
		return contadorNumerosImpares;
		
		
	}

		
	public int cantidadDeMultiplosDel(int numero, List<Integer> listaDeNumeros) {
		
		int contadorDeMultiplos = 0;
		
		for (int num : listaDeNumeros ) {
			
			if (num % numero == 0 )
				
				contadorDeMultiplos = contadorDeMultiplos + 1;
			
		}
		
		return contadorDeMultiplos;
			
		
	}

}

