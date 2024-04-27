package ar.edu.unq.po2.tp6;

public class Cliente {

	private String nombre;
	private String apellido;
	private int edad;
	private double sueldoMensual;
	private Banco banco;
	private Propiedad propiedad;

	public Cliente(String nombre, String apellido, int edad, double sueldoMensual, Banco banco, Propiedad propiedad) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setEdad(edad);
		this.sueldoMensual = sueldoMensual;
		this.banco = banco;
		this.propiedad = propiedad;
	}

	public void solicitarCreditoPersonalDe(Double montoASolicitar) {
		banco.setSolicitudDeCreditoPersonal(this, montoASolicitar, 12);
	}

	public void solicitarCreditoHipotecarioDe(Double montoASolicitar) {
		banco.setSolicitudDeCreditoHipotecario(this, montoASolicitar, 12, this.propiedad);

	}

	public Double getSueldoNetoAnual() {
		Double sueldoAnual = sueldoMensual * 12;
		return sueldoAnual;
	}

	public double getSueldoMensual() {

		return sueldoMensual;
	}

	public Propiedad getPropiedad() {
	
		return propiedad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
