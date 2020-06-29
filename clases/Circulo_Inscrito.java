import java.util.*;
public class Circulo_Inscrito {

	static Scanner input = new Scanner(System.in);
	
public static void main(String[]args){
	

	Circulo c;
	double L, area, circunferencia;
	System.out.println("¿Lado del cuadro?");
	L = input.nextDouble();
	c = new Circulo(L/2);
	area = c.calcularArea();
	circunferencia = c.Circunferencia();
	System.out.println("Área: "+area);
	System.out.println("Área: "+ c.calcularArea());
	System.out.println("Circunferencia: "+ circunferencia);
	c.setradio(-1);
	
	}
}
