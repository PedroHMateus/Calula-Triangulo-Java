package pacote;

public class Triangulo {
	//atributos
	double xA,xB,xC; 
	double yA,yB,yC,b,a;
	
	//metodos
	
	public void lados() {
		//definição dos metodos
	}
	
	
	public Double areaX(double p1){
		double p = (xA+xB+xC)/2;
	    return Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));
	}
	
	
	public Double areaY(double a1) {
		double a = (yA+yB+yC)/2;
	    return Math.sqrt(a*(a-yA)*(a-yB)*(a-yC));
}
	
	
	public void diferença() {
		
	}
}

