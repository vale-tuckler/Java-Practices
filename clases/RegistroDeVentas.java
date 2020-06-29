import java.util.*;
import javax.swing.*;
public class RegistroDeVentas {

	public static void main(String[]args) {
		vendedor lista[], vendedor;
		int i=0, n=0, mayor=0, num=0;
		double total=0, ventas=0;
		String nom="";
		
		//Leer vendedores mientras el número sea mayor a cero
		//A
		
		lista = new vendedor[100];
		
		i=0;
		num= Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuál es el número de vendedor?"));
		while(num>0) {
			nom = JOptionPane.showInputDialog(null, "¿Cuál es el nombre del vendedor?");
			ventas = Double.parseDouble(JOptionPane.showInputDialog(null,"¿Cuál es el número de ventas?"));
			lista[i]= new vendedor(num,nom,ventas);
			num = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuál es el número de vendedor?"));
		}
		
		//B
		n=i;
		i=0;
		
		while(lista[i]!=null) {
			System.out.println(lista[i].toString());
			i++;
		}
		
		//C Buscar el vendedor con mayores ventas 
		vendedor = lista[0];
		
		for(i=0;i<n;i++) {
			if(lista[i].getVentas()>vendedor.getVentas()) {
				vendedor = lista[i];
			}
			System.out.println("\nVendedor con más ventas: \n"+vendedor.toString());
		}
		
		//D
		System.out.println("Vendedores con ventas superiores a 10,000: ");
		for(i=0;i<n;i++) {
			if(lista[i].getVentas()>10000) {
				System.out.println(lista[i].getNombre());
			}
		}
		
		//E Suma 
		for(i=0;i<n;i++) {
			total = total + lista[i].getVentas();
		}
		System.out.println("Ventas totales: "+total);
		
		//F Generar un listado con toda la dirección de los vendedores con ventas por debajo de 1,000
		System.out.println("Vendedores con baja productividad");
		
		for(i=0;i<n;i++) {
			if(lista[i].getVentas()<10000) {
				System.out.println(lista[i].toString());
			}
		}
		
		
	}
}
