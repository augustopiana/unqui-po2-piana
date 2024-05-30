package ar.edu.unq.po2.tp10.videoJuego;

public class MaquinaOnePlayer extends EstadoMaquina {

	public MaquinaOnePlayer(MaquinaRetro maquinaJuegos) {
		super(maquinaJuegos);
	}

	@Override
	public void presionarBotonInicio() {
		// pasado un tiempo se presiona el boton para finalizar el juego y vuelve a estado inicicial
		this.getMaquinaJuegos().setEstado(new MaquinaEncendida(this.getMaquinaJuegos()));
	}

}
