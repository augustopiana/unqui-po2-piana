package ar.edu.unq.po2.tp6;

public class CreditoHipotecario extends Credito {

	private Propiedad propiedadEnGarantia;

	public CreditoHipotecario(Cliente cliente, Double montoASolicitar, Integer plazoEnMeses, Propiedad propiedad) {
		this.solicitante = cliente;
		this.montoSolicitado = montoASolicitar;
		this.plazoEnMeses = plazoEnMeses;
		this.setPropiedadEnGarantia(propiedad);
	}

	@Override
	protected Boolean esAceptable() {
		Boolean condicion1 = montoSolicitado < (solicitante.getSueldoMensual() / 2);
		Boolean condicion2 = montoSolicitado < (propiedadEnGarantia.getValorFiscal() * 0.7);
		Boolean condicion3 = solicitante.getEdad() + (plazoEnMeses / 12) < 65;
		
		return (condicion1 && condicion2 && condicion3);
	}

	public Propiedad getPropiedadEnGarantia() {
		return propiedadEnGarantia;
	}

	public void setPropiedadEnGarantia(Propiedad propiedadEnGarantia) {
		this.propiedadEnGarantia = propiedadEnGarantia;
	}

}
