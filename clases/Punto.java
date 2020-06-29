import java.util.*;
public class Punto {

	private double x, y;
	public Punto(double abcisa, double ordenada) {
		x = abcisa;
		y = ordenada;
	}
	
	public void setx(double puntox) {
		x = puntox;
	}
	
	public void sety(double puntoy) {
		y = puntoy;
	}
	
	public double getx() {
		return x;
	}
	
	public double gety() {
		return y;
	}
	
	public double CalcularDist(Punto P) {
		return Math.sqrt((P.gety()) - y) * (P.gety() + (P.getx() - x) * (P.getx() - x));
	}
	
}
