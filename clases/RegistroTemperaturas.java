import java.util.*;
import javax.swing.*;

public class RegistroTemperaturas {

	public static void main(String[]args) {
		
		String meses[];
		double c[], f[];
		int i;
		
		Scanner entrada = new Scanner(System.in);
		
		meses = new String[12];
		
		c = new double[12];
		f = new double[12];
		
		meses[0]="Enero";
		meses[1]="Febrero";
		meses[2]="Marzo";
		meses[3]="Abril";
		meses[4]="Mayo";
		meses[5]="Junio";
		meses[6]="Julio";
		meses[7]="Agosto";
		meses[8]="Septiembre";
		meses[9]="Octubre";
		meses[10]="Noviembre";
		meses[11]="Diciembre";
		
		 //Pidiendo las temperaturas
		
		for(i=0;i<12;i++) {
		
			System.out.println("Dame la temperatura de: " + meses[i]);
			c[i]= entrada.nextDouble();
			f[i]= (9.0/5)*c[i]+32;
		}
		
		System.out.println("Mes        C        F");
		System.out.println("=======================");
		
		for(i=0; i<12; i++) {
			System.out.println(meses[i]+"\t"+c[i]+"\t"+f[i]);
		}
	}
}
