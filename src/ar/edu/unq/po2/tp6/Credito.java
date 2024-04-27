package ar.edu.unq.po2.tp6;

public abstract class Credito {
	
	protected Cliente solicitante;
	protected Integer plazoEnMeses;
	protected Double montoSolicitado;
	protected Boolean esAceptable;
	
	protected abstract Boolean esAceptable();

	protected Double getMontoPorCuota() {
		Double montoPorCuota = (this.montoSolicitado / this.plazoEnMeses);
		return montoPorCuota;
	}

	protected Double getMontoSolicitado() {
		return montoSolicitado;
	}

}
