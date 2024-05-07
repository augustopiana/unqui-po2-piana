package ar.edu.unq.po2.tp8;

import java.util.List;

public abstract class Filtro {


	public final List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia){
		return this.aplicarFiltro(page, wikipedia);
	}

	protected abstract List<WikipediaPage> aplicarFiltro(WikipediaPage page, List<WikipediaPage> wikipedia);
	
	
}
