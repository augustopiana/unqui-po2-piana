package ar.edu.unq.po2.tp8.ejercicioWiki;

import java.util.List;
import java.util.Map;

public class WikipediaPage implements IWikipediaPage {

	private String title;
	private List<WikipediaPage> links;
	private Map<String, WikipediaPage> infobox;

	public WikipediaPage(String title, List<WikipediaPage> links, Map<String, WikipediaPage> infobox) {
		super();
		this.title = title;
		this.links = links;
		this.infobox = infobox;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setLinks(List<WikipediaPage> links) {
		this.links = links;
	}

	public void setInfobox(Map<String, WikipediaPage> infobox) {
		this.infobox = infobox;
	}

	@Override
	public String getTitle() {
		return this.title;
	}

	@Override
	public List<WikipediaPage> getLinks() {
		return this.links;
	}

	@Override
	public Map<String, WikipediaPage> getInfobox() {
		return this.infobox;
	}

	public boolean poseeAlgunLink(List<WikipediaPage> links) {

		return this.getLinks().stream().anyMatch(l -> l.perteneceA(links));

	}

	private boolean perteneceA(List<WikipediaPage> links) {
		return links.stream().anyMatch(l -> l.equals(this));
	}

	@SuppressWarnings("unchecked")
	public boolean tienePropiedadEnComun(WikipediaPage page) {
	
		List<String> clavesPropias = (List<String>) this.getInfobox().keySet();

		List<String> clavesParaComparar = (List<String>) page.getInfobox().keySet();
		
		return clavesParaComparar.stream().anyMatch(c -> clavesPropias.contains(c));
		
		
	}

}
