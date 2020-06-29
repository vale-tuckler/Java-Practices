import java.lang.Math;
public class Circulo {

	
  protected double radio;

public Circulo(double r) {
	radio = r;
	}


public void setradio(double r) {
	if (r>0) {
		radio = r;
	}
	else {
		System.out.println("Radio no válido, no se actualizará el valor");
	}
}

public double getradio() {
	return radio;
}
public double calcularArea() {
	double a = 0;
	
	a = Math.PI * Math.pow(radio, 2); 
	return a;
}

public double Circunferencia() {
	
	double c = 0;
	
	c = 2 * Math.PI * radio;
	return c;
}

}
	
	

