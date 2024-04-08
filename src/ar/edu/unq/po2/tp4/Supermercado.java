package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	
	private String nombreSuper;
	private String dirSuper;
	private List<Producto> productos = new ArrayList<Producto>(); // Porque declaro tipo List, pero creo array?.
	
	public Supermercado(String nombre, String dir, List<Producto> listaProductos) {
		
		this.setNombreSuper(nombre);
		this.setDirSuper(dir);
		this.setProductos(listaProductos);
		
	
	}

	public String getNombreSuper() {
		return nombreSuper;
	}

	public void setNombreSuper(String nombreSuper) {
		this.nombreSuper = nombreSuper;
	}

	public String getDirSuper() {
		return dirSuper;
	}

	public void setDirSuper(String dirSuper) {
		this.dirSuper = dirSuper;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Integer cantProductos() {
	
		int cantProductos = 0;
		
		for (int i = 0; i < productos.size(); i++) {
			
			cantProductos ++;
		
		}
		
		return cantProductos;
		
	}

	public Double precioTotalProductos() {
		
		System.out.println("Number of products: " + productos.size());
		
		Double precioTotal = 0.0;
		
		for (Producto prod: productos) {
			
			precioTotal = precioTotal + prod.getPrecio();
					
		
		}
		
		return precioTotal;
		
		
		
	}

	
	
	

}
