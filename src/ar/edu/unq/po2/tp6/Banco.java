package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Banco {

	private String nombre;
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Credito> solicitudes = new ArrayList<Credito>();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Banco(String nombre) {
		this.setNombre(nombre);
	}

	public List<Cliente> getClientes() {
		return clientes;

	}

	public List<Credito> getSolicitudesCredito() {

		return solicitudes;

	}

	public void setCliente(Cliente clienteParaAgregar) {
		this.clientes.add(clienteParaAgregar);
	}

	public void setSolicitudDeCreditoPersonal(Cliente cliente, double montoASolicitar, Integer plazoEnMeses ) {
		CreditoPersonal solicitudCredito = new CreditoPersonal (cliente,montoASolicitar,plazoEnMeses);
		solicitudes.add(solicitudCredito);

	}

	public void setSolicitudDeCreditoHipotecario(Cliente cliente, Double montoASolicitar, Integer plazoEnMeses, Propiedad propiedad) {
		CreditoHipotecario solicitudCredito = new CreditoHipotecario(cliente,montoASolicitar,plazoEnMeses,propiedad);
		solicitudes.add(solicitudCredito);
		
	}

	public Double montoTotalDeDineroADesembolsar() {
		Stream<Credito> stream = solicitudes.stream();
		
		Double montoTotal = stream.filter(c -> c.esAceptable())
							.mapToDouble(c -> c.getMontoSolicitado())
							.sum();
		
		return montoTotal;
		
	}

}
