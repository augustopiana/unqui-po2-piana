package ar.edu.unq.po2.tp10.videoJuego;

public class MaquinaRetro  {

	int cantidadFichas;
	EstadoMaquina estado;
	
	public MaquinaRetro() {
		this.estado = new MaquinaEncendida(this);
		
	}
		
	public void presionarBotonInicio() {
		this.estado.presionarBotonInicio();
	}
	
	public void setFichas(int cantFichas ) {
		this.cantidadFichas = this.cantidadFichas + cantFichas;
		
	}
	
	public void setEstado(EstadoMaquina nuevoEstado) {
		this.estado = nuevoEstado;
	}
	
	public int getFichas() {
		return cantidadFichas;
	}
	
	
	
}
