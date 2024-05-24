package ar.edu.unq.po2.tp8.ejercicioWiki;

import java.util.List;

public class MismaLetraInicial extends Filtro {

	@Override
	protected List<WikipediaPage> aplicarFiltro(WikipediaPage page, List<WikipediaPage> pages) {
		
		String letraAComparar = page.getTitle().substring(0,1);
								
		return pages.stream().filter(p -> p.getTitle().startsWith(letraAComparar))
			        .toList();
	
		
	}
	

}
