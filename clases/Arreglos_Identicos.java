import java.util.*;
public class Arreglos_Identicos {

	public static void main(String[]args) {
		int a [], b[], i,n;
		boolean flag = true; 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dame el tamaño del arreglo: \t");
		n = entrada.nextInt();
		
		a = new int[n];
		b = new int[n];
		
		//Se van a incorporar tres ciclos
		
		//Primer ciclo lee el arreglo A
		for(i=0;i<n;i++) {
			System.out.println("Dato a[" + i + "]");
			a[i]=entrada.nextInt();
		}
		
		//Segundo ciclo lee los datos en B
		for (i=0;i<n;i++) {
			System.out.println("Dato b[" +i+"]");
			b[i]=entrada.nextInt();
		}
		
		//Tercer ciclo para comparar si los dos arreglos son iguales
		for(i=0;i<n;i++) {
			if(a[i]!=b[i]){
				flag=false; //break;
			}
			
			System.out.println(a[i]+"\t"+b[i]);//La impresión debe ser dentro del ciclo en el que se hace la comparación o cálculo
			
		//*Poner paréntesis en blanco siginifica que el programa no va a hacer nada.
			
			}
		
		
		if(flag) 
			System.out.println("Los arreglos idénticos");
		else
			System.out.println("Los arreglos son diferentes");
		
		
	}
}
