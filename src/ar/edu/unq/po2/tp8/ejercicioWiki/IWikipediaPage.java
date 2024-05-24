package ar.edu.unq.po2.tp8.ejercicioWiki;

import java.util.List;
import java.util.Map;

public interface IWikipediaPage {

	public String getTitle();
	
	public List<WikipediaPage> getLinks();
	
	public Map<String,WikipediaPage> getInfobox();
	
}
