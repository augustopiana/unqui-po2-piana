package ar.edu.unq.po2.tp10.encriptacion;

public class EncriptadorNaive {
	
	private IEncriptadorNaive estrategia;
	
	
	public EncriptadorNaive(){
		
	}
	
	public void setStrategy(IEncriptadorNaive nuevaEstrategia) {
		this.estrategia = nuevaEstrategia;
	}
	
	public IEncriptadorNaive getStrategy() {
		return estrategia;
	}
	
	public String encriptar(String mensaje) {
		return this.estrategia.encriptar(mensaje);
	}
	
	public String desincriptar(String mensaje) {
		return this.estrategia.desincriptar(mensaje);
	}
	
	
	
	
	

}
