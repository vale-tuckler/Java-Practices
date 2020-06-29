import java.util.*;
public class calcularVarianza {
static Scanner entrada = new Scanner(System.in);
	public static void main(String[]args) {
		
		double x[], prom, var, suma;
		int n,i;
		
		//Calculando el promedio
		
		System.out.println("cuantos puntos son?");
		n = entrada.nextInt();
		x = new double[n];
		for(i =0; i<n;i++) {
			System.out.println("dame el dato sub " + i);
			x[i]= entrada.nextDouble();
		}
		
		suma =0;
		for (i=0; i<n;i++) {
			suma = suma+x[i];
			
		}
		
		prom = suma/n;
		
		//Calculando la varianza
		
		for(i = 0; i<n;i++) {
			suma = suma + ((x[i] - prom) * (x[i] - prom));
		}
		var = suma /n;
		System.out.println("EL promedio es: " + prom);
		System.out.println("La varianza es: " + var);
		
		
	}
}
