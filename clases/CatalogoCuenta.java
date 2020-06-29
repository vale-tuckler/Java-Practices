import java.util.*;
public class CatalogoCuenta {
	public static void main(String[]args) {
		int i,n,num;
		String tit;
		double saldo;
		Cuenta catalogo[];
				
		Scanner entrada = new Scanner (System.in);
		
		catalogo = new Cuenta[100];
		
		i=0;
		System.out.println("¿Número de cuenta?");
		
		num = entrada.nextInt();
		
		while(num>0) {
			System.out.println("¿Titular?");
			tit = entrada.next();
			
			System.out.println("¿Saldo inicial?");
			saldo=entrada.nextDouble();
			
			catalogo[i]= new Cuenta (num,tit,saldo);
			i++;
		}
		 i=0;
		 while(catalogo[i]!=null) {
			 System.out.println(catalogo[i].toString());
			 i++;
		 }
		
	}	
}


