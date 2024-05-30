package ar.edu.unq.po2.tp10.encriptacion;

public class EncriptadorAlteradorOrden implements IEncriptadorNaive {

	@Override
	public String encriptar(String mensaje) {
		return new StringBuilder(mensaje).reverse().toString();
	}

	@Override
	public String desincriptar(String mensaje) {
		return this.encriptar(mensaje);
	}

}
