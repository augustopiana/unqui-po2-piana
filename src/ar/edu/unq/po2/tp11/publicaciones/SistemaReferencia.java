package ar.edu.unq.po2.tp11.publicaciones;

import java.util.ArrayList;
import java.util.List;

public class SistemaReferencia {
	
	List<Articulo>	articulos = new ArrayList<Articulo>();
	List<InvestigadorInteres>	intereses = new ArrayList<InvestigadorInteres>(); // observers
	
	public void suscribir(InvestigadorInteres s) {
		this.intereses.add(s);
	}
	
	
	public void desuscribir(InvestigadorInteres s ) {
		this.intereses.remove(s);
	}
	
	public void notificarIngreso(Articulo a) {
		this.intereses.stream().forEach(i -> i.notify(a));		
	}
	
	public void crearArticulo(String t, String tipo, String l, List<String> autores, List<String> palabrasClaves, List<String> filiaciones ) {
		
		Articulo nuevoArt = new Articulo(t, tipo, l, autores, palabrasClaves, filiaciones);
		
		this.articulos.add(nuevoArt);
		this.notificarIngreso(nuevoArt);
	}
	
	
	

}
