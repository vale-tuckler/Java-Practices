import java.util.Scanner;
public class MejorTrabajo {
//Un determinado trabajo tiene una duración de 30 días y se pagan 10.00 diarios; otro trabajo también dura 30 días, pero se paga $ 1.00 el primer día, $ 2.00 el segundo
//y así sucesivamente hasta $ 30.00 el último día.  
//Escribir una aplicación  llamada “MejorTrabajo”, que me permita decidir cuál es el trabajo mejor pagado.
	public static void main (String[]args) {
	   
		int trabajo1 = 0;
		int trabajo2 = 0;
		
		for(int i = 0; i<=30; i++) {   // trabajo 1 = 465   trabajo 2 = 300
										// trabajo 1 es la sucesión n+1
			trabajo1 += i ;				//trabajo 2 es la multiplicación
		}
		
		
		trabajo2 = 10 * 30; 
		
		
		if (trabajo1<trabajo2) {
			System.out.println("El mejor trabajo es el trabajo 2");
			System.out.println("Salario del trabajo 2: " +trabajo2);
		}
		
		else if (trabajo1>trabajo2) {
			System.out.println("El mejor trabajo es el trabajo 1");
			System.out.println("Salario del trabajo 1: " +trabajo1);
			
		}
		
		
	
	}
}
