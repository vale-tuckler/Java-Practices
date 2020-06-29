import java.util.*;
public class Pares_Impares {

	public static void main(String[]args) {
		int x[], pares[], impares[], i,j,k,n;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Cuántos datos son?");
		n = entrada.nextInt();
		x = new int[n];
		
		pares = new int[n];
		impares = new int[n];
		
		for(i=0; i<n;i++) {
			System.out.println("Dame el valor de n: ");
			x[i] = entrada.nextInt();
		}
		
		for(i=0,j=0,k=0;i<n;i++) {
			if(x[i]%2==0) {
				pares[j]=x[i];j++;
			}
			
			else {
				impares[k]=x[i];k++;
			}
			System.out.println("\n Números pares: ");
			for(i=0;i<j;i++) {
				System.out.println(pares[i]);
			}
			System.out.println("Pares: " +j+"\n\n");
			
			for(i=0;i<k;i++) {
				System.out.println(impares[i]);
			}
			System.out.println("Impares: "+ k);
			System.out.println("\n Datos: ");
			
			for(i=0;i<n;i++) {
				System.out.println(x[i]+"\t"+impares[i]);
			}
		}
		
		
		
	}
}
