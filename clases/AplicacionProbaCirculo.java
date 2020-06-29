import java.util.*;
public class AplicacionProbaCirculo {

	static Scanner input = new Scanner(System.in);
	public static void main(String[]args) {
		
		Probabilidad c; // c2, c3;
		double r1, r2, r3, p1, p2, p3;
		System.out.println("Introduzca radio 1: ");
		r1 = input.nextDouble();
		
		System.out.println("Introduzca radio 2: ");
		r2 = input.nextDouble();
		
		System.out.println("Introduzca radio 3: ");
		r3 = input.nextDouble();
		
		c = new Probabilidad(r1,r2,r3);
		
		//c = new Probabilidad(r1,r2,r3);
		
		//c3 = new Probabilidad(r1,r2,r3);
		
		
		c.getradio1();
		c.setradio1(r1);
		
		c.getradio2();
		c.setradio2(r2);
		
		c.getradio3();
		c.setradio3(r3);
		
		System.out.println("Probabilidad de que caiga en el círculo más pequeño: "+ c.Probability1() * 100 + "%");
		
		System.out.println("Probabilidad de que caiga en el círculo del medio: "+ c.Probability2() * 100 + "%");
		
		System.out.println("Probabilidad de que caiga en el círculo más grande: "+ c.Probability3() * 100 + "%");
	}
}