package ar.edu.unq.po2.tp3;

public class Rectangulo {

	Point punto1 ;
	Point punto2 ;
	Point punto3 ;
	Point punto4;
	
	
	public Rectangulo() {
		
		// PUNTO2 Y PUNTO1 EJE Y =
		// PUNTO1 Y PUNTO4 EJE X =
		// PUNTO4 Y PUNTO3 EJE Y =
		// PUNTO3 Y PUNTO2 EJE X =
		
		this.punto1 = new Point(1,0);
		this.punto2 = new Point(-1,0);
		this.punto3 = new Point(-1,-2);
		this.punto4 = new Point(1, -2);
	
		
		
	}


	public Point getPunto1() {
		return punto1;
	}


	public void setPunto1(Point punto1) {
		this.punto1 = punto1;
	}


	public Point getPunto2() {
		return punto2;
	}


	public void setPunto2(Point punto2) {
		this.punto2 = punto2;
	}


	public Point getPunto3() {
		return punto3;
	}


	public void setPunto3(Point punto3) {
		this.punto3 = punto3;
	}


	public Point getPunto4() {
		return punto4;
	}


	public void setPunto4(Point punto4) {
		this.punto4 = punto4;
	}
	
	
}
