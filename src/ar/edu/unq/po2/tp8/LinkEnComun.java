package ar.edu.unq.po2.tp8;

import java.util.List;

public class LinkEnComun extends Filtro {

	@Override
	protected List<WikipediaPage> aplicarFiltro(WikipediaPage page, List<WikipediaPage> pages) {
		List<WikipediaPage> links = page.getLinks();
		
		return pages.stream().filter(p -> p.poseeAlgunLink(links)).toList();
		
	}	

}
