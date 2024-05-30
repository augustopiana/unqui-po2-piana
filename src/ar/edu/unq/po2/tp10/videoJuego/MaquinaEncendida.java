package ar.edu.unq.po2.tp10.videoJuego;

public class MaquinaEncendida extends EstadoMaquina {

	public MaquinaEncendida(MaquinaRetro mq) {
		super(mq);
	}

	@Override
	public void presionarBotonInicio() {
		if (this.getMaquinaJuegos().getFichas() == 1) {
			this.getMaquinaJuegos().setEstado(new MaquinaOnePlayer(this.getMaquinaJuegos()));
		} else {
			this.getMaquinaJuegos().setEstado(new MaquinaMultiPlayer(this.getMaquinaJuegos()));
		}
	}

}
