package ar.edu.unq.po2.tp3;

public class EquipoDeTrabajo {

	private String nombre;
	private Persona[] equipo;

	public EquipoDeTrabajo(String nombre, Persona[] equipo) {

		this.nombre = nombre;
		this.equipo = equipo;

	}

	public String getNombre() {

		return nombre;

	}

	public int promedioEdadIntegrantes() {

		int sumaEdades = 0;
		int cantidadPersonas = this.equipo.length;
		int promedioFinal;

		for (Persona persona : equipo) {

			sumaEdades = sumaEdades + persona.getEdad();

		}

		promedioFinal = sumaEdades / cantidadPersonas;

		System.out.println("El promedio de edad es: " + promedioFinal);

		return promedioFinal;

	}

}
