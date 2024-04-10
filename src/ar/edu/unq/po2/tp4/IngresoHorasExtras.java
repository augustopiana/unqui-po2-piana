package ar.edu.unq.po2.tp4;

public class IngresoHorasExtras extends Ingreso {

	private Integer horasExtras;

	public IngresoHorasExtras(int mes, String concepto, int monto, int horasExtras) {
		super(mes, concepto, monto);
		this.setHorasExtras(horasExtras);

	}
	

	private void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	public  int getMontoImponible() {
		
		int montoImponible = 0;
	
		return montoImponible;
		
	}


	public Integer getHorasExtras() {
		return horasExtras;
	}


	public void setHorasExtras(Integer horasExtras) {
		this.horasExtras = horasExtras;
	}

	
	
	
	
	
}





