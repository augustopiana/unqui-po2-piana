package ar.edu.unq.po2.tp11.publicaciones;

import java.awt.geom.NoninvertibleTransformException;
import java.util.ArrayList;
import java.util.List;

public abstract class  InvestigadorInteres {
	
	List<Investigador> investigadores = new ArrayList<Investigador>(); // observers
	
	
	public void suscribir(Investigador i) {
		this.investigadores.add(i);
	}
	
	public void desuscribir(Investigador i) {
		this.investigadores.remove(i);
	}
	
	public void notify(Articulo a) {
		if(esDeMiInteres()) {
			this.investigadores.stream().forEach(i -> i.recibirArticulo(a));
		}
	}

	
	protected abstract boolean esDeMiInteres();

	public void suscribirInteresado(Investigador i) {
		
		investigadores.add(i);
	}
	
	public void desuscribirInteresado(Investigador i) {
		
		investigadores.remove(i);
	}
	
}
