import java.util.Scanner;
public class Hospedaje {

	//.- En el hotel Guamúchil se hace un descuento del 10%, si el cliente se hospeda más de 5 días, del 15%  si se hospeda más de 10 días.
	//Escribir una aplicación llamada “Hospedaje”
	//que lea  el número de días y el precio diario de la habitación  e imprima el subtotal a pagar, el descuento y el total a pagar.
	
	static Scanner input = new Scanner(System.in);
	
	public static void main (String []args) {
		
		double descuento = 0;
		 double dias = 0;
		 double precio = 0;
		 double subtotal = 0;
		 double total = 0;
		 
		 System.out.println("¿Cuántos días se va a hospedar? ");
		 dias = input.nextDouble();
		 System.out.println("¿Cuál es el precio diario de la habitación? ");
		 precio = input.nextDouble();
		 
		if (dias >= 5 && dias < 10) {
			
			descuento = 0.1;
			subtotal =  dias * precio;
			total = subtotal - (subtotal * descuento);		
			
			System.out.println("subtotal: " + subtotal);
			System.out.println("Descuento: " + descuento);
			System.out.println("Total: " + total);
		}
		
		if (dias >= 10) {
			
			descuento = 0.15;
			subtotal =  dias * precio;
			total = subtotal - (subtotal * descuento);
			
			System.out.println("subtotal: " + subtotal);
			System.out.println("Descuento: " + descuento);
			System.out.println("Total: " + total);
		}
		
				
	
	}
	
	}


