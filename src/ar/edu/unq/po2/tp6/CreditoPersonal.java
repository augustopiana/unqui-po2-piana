package ar.edu.unq.po2.tp6;

public class CreditoPersonal extends Credito {

	public CreditoPersonal(Cliente solicitante, double montoSolicitado, int plazoEnMeses) {
		this.solicitante = solicitante;
		this.montoSolicitado = montoSolicitado;
		this.plazoEnMeses = plazoEnMeses;
	}

	@Override
	protected Boolean esAceptable() {
		Boolean condicion1 = solicitante.getSueldoNetoAnual() > 15000;
		Boolean condicion2 = montoSolicitado < (solicitante.getSueldoMensual() * 0.7);
		this.esAceptable = (condicion1 && condicion2);
		return (condicion1 && condicion2);
	}

}
