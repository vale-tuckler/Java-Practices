import java.util.*;
public class AreaDona {
	
	 static Scanner entrada = new Scanner (System.in); //Parámetro del Scanner puede cambiar.
	public static void main (String []args) {
		
		Circulo c1;
		Circulo c2;
		
		double r1,r2, dif;
		
		System.out.println("Radio 1: ");
		
		r1 = entrada.nextDouble();
	
		
		System.out.println("Radio 2: ");
		r2 = entrada.nextDouble();
		
		c1 = new Circulo(r1);
		
		c2 = new Circulo(r2);
		
		dif = c2.calcularArea() - c1.calcularArea();
		
		System.out.println("Área buscada: "+ dif);
		
	}

}
