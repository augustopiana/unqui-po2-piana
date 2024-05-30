package ar.edu.unq.po2.tp11.publicaciones;

import java.util.ArrayList;
import java.util.List;

public class Articulo {
	
	String titulo;
	String tipo;
	String lugar;
	List<String> autores = new ArrayList<String>();
	List<String> palabrasClaves = new ArrayList<String>();
	List<String> filiaciones = new ArrayList<String>();
	
	public Articulo(String t, String tipo, String l, List<String> autores, List<String> palabrasClaves, List<String> filiaciones ) {
		this.titulo = t;
		this.tipo   = tipo;
		this.lugar = l ;
		this.autores = autores;
		this.filiaciones = filiaciones;
		this.palabrasClaves = palabrasClaves;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String t) {
		this.titulo = t;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getLugar() {
		return lugar;
	}


	public void setLugar(String lugar) {
		this.lugar = lugar;
	}


	public List<String> getAutores() {
		return autores;
	}


	public void setAutores(List<String> autores) {
		this.autores = autores;
	}


	public List<String> getPalabrasClaves() {
		return palabrasClaves;
	}


	public void setPalabrasClaves(List<String> palabrasClaves) {
		this.palabrasClaves = palabrasClaves;
	}


	public List<String> getFiliaciones() {
		return filiaciones;
	}


	public void setFiliaciones(List<String> filiaciones) {
		this.filiaciones = filiaciones;
	}
	

}
