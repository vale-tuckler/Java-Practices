import java.util.*;
public class CatalogoCuentas {
	public static void main(String[]args) {
		Cuenta catalogo[];
		int i,n,num;
		String tit;
		double saldo;
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("¿Cuántas cuentas son?");
		n = entrada.nextInt();
		
		catalogo = new Cuenta[n];
		
		for(i=0;i<n;i++) {
			System.out.println("¿Cuál es el número de cuenta "+i+"?");
			num = entrada.nextInt();
			
			System.out.println("¿Cuál es el nombre del titular de la cuenta "+i+"?");
			tit = entrada.next();
			
			System.out.println("¿Cuál es el saldo de la cuenta "+i+"?");
			saldo = entrada.nextDouble();
			
			catalogo[i] = new Cuenta(num,tit, saldo);
			
		}
		
		//IMPRIMIENDO LOS DATOS
		
		for(i=0;i<n;i++) {
			System.out.println(catalogo[i].toString());
		}
	}
	

}
