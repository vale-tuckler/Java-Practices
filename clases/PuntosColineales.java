import java.util.*;
public class PuntosColineales {

	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		
		Punto a,b,c;
		double x,y;
		//PARA EL PUNTO A
		System.out.println("Dame X para el punto a: ");
		x = entrada.nextDouble();
		
		System.out.println("Dame Y para el punto a: ");
		y = entrada.nextDouble();
		 a = new Punto(x,y);
		 
		 
		 //PARA EL PUNTO B
		 System.out.println("Dame X para el punto b: ");
			x = entrada.nextDouble();
			
		System.out.println("Dame Y para el punto b: ");
		y = entrada.nextDouble();
		b = new Punto(x,y);
		
		
		//PARA EL PUNTO C
		System.out.println("Dame X para el punto c: ");
		x = entrada.nextDouble();
		
		System.out.println("Dame Y para el punto c: ");
		y = entrada.nextDouble();
		 c = new Punto(x,y);
		 
		 System.out.println("Distancia de a --> b: " + a.CalcularDist(b));
		 System.out.println("Distancia de b --> a: " + b.CalcularDist(a));
		 
		 //CALCULANDO SI SON COLINEALES
		 
		 if(a.CalcularDist(b) + b.CalcularDist(c) == a.CalcularDist(c)) { //A calcula la distancia a B y B calcula la distancia a C
			 System.out.println("Los puntos son colineales");
		 }
		 
		 else {
			 System.out.println("Los puntos son los vértices de un triángulo");
		 }
		
			 
		 
	}
}
