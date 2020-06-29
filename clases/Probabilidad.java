import java.lang.*;
public class Probabilidad {

	private double r1, r2, r3;
	private double a1, a2, a3;
	private double p1, p2, p3;
	
	public Probabilidad(double nuevor1, double nuevor2, double nuevor3) {
		nuevor1 = r1;
		nuevor2 = r2;
		nuevor3 = r3;
		}
	

	public void setradio1(double r) {
		r1 = r;
	}
	
	public void setradio2(double r) {
		r2 = r;
	}
	
	public void setradio3(double r) {
	
		r3 = r;
	}
		

	public double getradio1() {
		return r1;
	}
	
	public double getradio2() {
		return r2;
	}
	
	public double getradio3() {
		return r3;
		
	}
	
	public double calcularArea1() {
		a1 = 0;
		
		a1 = Math.PI * Math.pow(r1, 2); 
		return a1;
	}
	
	public double calcularArea2() {
		a2 = 0;
		
		a2 = Math.PI * Math.pow(r2, 2); 
		return a2;
	}
	
	public double calcularArea3() {
		a3 = 0;
		
		a3 = Math.PI * Math.pow(r3, 2); 
		return a3;
	}
	
	public double Probability1() {  //Probabilidad del círculo más pequeño
		p1 = 0;
		
		p1 = a1/a3;
		return p1;
	}

	public double Probability2() {  //Probabilidad del círculo mediano
		p2 = 0;
		
		p1 = (a2-a1)/ a3;
		return p1;
	}
	
	public double Probability3() {  //Probabilidad del círculo más grande
		p3 = 0;
		
		p3 = (a3-a2)/ a3;
		return p3;
	}


	}
		
		



