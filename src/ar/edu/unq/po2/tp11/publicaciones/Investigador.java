package ar.edu.unq.po2.tp11.publicaciones;

import java.util.ArrayList;
import java.util.List;

public class Investigador {

	List<Articulo> articulosDeInteres = new ArrayList<Articulo>();
	InvestigadorInteres interes;

	public Investigador(InvestigadorInteres i) {

		interes = i;
		interes.suscribirInteresado(this);
		articulosDeInteres = new ArrayList<Articulo>();
	}

	public void recibirArticulo(Articulo a) {
		this.articulosDeInteres.add(a);
	}

}
