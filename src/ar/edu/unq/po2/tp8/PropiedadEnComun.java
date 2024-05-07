package ar.edu.unq.po2.tp8;

import java.util.List;

public class PropiedadEnComun extends Filtro {

	@Override
	protected List<WikipediaPage> aplicarFiltro(WikipediaPage page, List<WikipediaPage> pages) {
		
		
		return pages.stream().filter(p -> p.tienePropiedadEnComun(page)).toList();
	
		
		
	}

	
	
}
