package ar.edu.unq.po2.tp10.videoJuego;

public abstract class EstadoMaquina {
	
	private MaquinaRetro maquinaRetro;
	
		
	public EstadoMaquina(MaquinaRetro maquinaRetro) {
		this.maquinaRetro = maquinaRetro;
	}

	public abstract void presionarBotonInicio();
	
	public MaquinaRetro getMaquinaJuegos() {
		return maquinaRetro;
	}

	public void setMaquinaJuegos(MaquinaRetro maquinaRetro) {
		this.maquinaRetro = maquinaRetro;
	}
	
	
}
