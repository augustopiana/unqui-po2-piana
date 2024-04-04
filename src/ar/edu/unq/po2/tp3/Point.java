package ar.edu.unq.po2.tp3;

public class Point {
	
	int ejeX;
	int ejeY;
	

	public Point(int ejeX, int ejeY) {
		
		setEjeX(ejeX) ;
		setEjeY(ejeY) ;
		
	}


	public Point() {
		
		setEjeX(0) ;
		setEjeY(0) ;
		
	}


	public int getEjeX() {
		return ejeX;
	}


	public void setEjeX(int ejeX) {
		this.ejeX = ejeX;
	}


	public int getEjeY() {
		return ejeY;
	}


	public void setEjeY(int ejeY) {
		this.ejeY = ejeY;
	}


	public void reubicarseEn(int nuevoX, int nuevoY) {
		
		setEjeX(nuevoX);
		setEjeY(nuevoY);
		
		
	}


	public Point sumarseCon(Point point) {
		
		int ejeXParametro = point.getEjeX();
		int ejeYParametro = point.getEjeY();
		
		Point nuevoPoint = new Point(this.getEjeX()+ejeXParametro, this.getEjeY()+ejeYParametro);
		
		return nuevoPoint;
		
		
	}

}
