package ar.edu.unq.po2.tp4;

public class Ingreso {
	
	
	@SuppressWarnings("unused")
	private Integer mesPercepcion;
	@SuppressWarnings("unused")
	private String concepto;
	private Integer montoPercibido;
	

	public Ingreso(int mes, String concepto, int monto) {
	
		this.setMesPercepcion(mes);
		this.setConcepto(concepto);
		this.setMontoPercibido(monto);
		
		
	}
	
	

	private void setConcepto(String concepto) {
		this.concepto = concepto;
		
	}

	public void setMesPercepcion(Integer mesPercepcion) {
		this.mesPercepcion = mesPercepcion;
	}

	public void setMontoPercibido(Integer montoPercibido) {

		this.montoPercibido = montoPercibido;
	}

	public Integer getMontoPercibido() {
		
		return montoPercibido;
		
	}

	public  int getMontoImponible() {
		
		int montoImponible = (2 * this.getMontoPercibido()) / 100;
	
		return montoImponible;
		
	}

	
	
	
}
