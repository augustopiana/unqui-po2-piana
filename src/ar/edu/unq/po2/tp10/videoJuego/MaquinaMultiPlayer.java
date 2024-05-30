package ar.edu.unq.po2.tp10.videoJuego;

public class MaquinaMultiPlayer extends EstadoMaquina {

	public MaquinaMultiPlayer(MaquinaRetro maquinaJuegos) {
		super(maquinaJuegos);
	}

	@Override
	public void presionarBotonInicio() {
		// pasado un tiempo se presiona el boton para finalizar el juego y vuelve a estado inicicial
		this.getMaquinaJuegos().setEstado(new MaquinaEncendida(this.getMaquinaJuegos()));
	}

}
