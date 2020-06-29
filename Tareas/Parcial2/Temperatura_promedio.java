package Parcial2;
import javax.swing.*;
public class Temperatura_promedio {
	public static void main(String[]args) {
		//8. Escribir un programa que lea la temperatura promedio de cada mes.
		// Que busque el mes más caluroso y cuál es su temperatura promedio.
		//Imprimir el nombre del mes y la temperatura.
		
		double Tmayor=0, Tpromedio[],t=0;
		String mes[];
		int i;
		
		Tpromedio = new double[12];
		mes=new String[12];
		mes[0]="enero";
		mes[1]="febrero";
		mes[2]="marzo";
		mes[3]="abril";
		mes[4]="mayo";
		mes[5]="junio";
		mes[6]="julio";
		mes[7]="agosto";
		mes[8]="septiembre";
		mes[9]="octubre";
		mes[10]="noviembre";
		mes[11]="diciembre";
		
		for(i=0;i<12;i++) {
			t=Double.parseDouble(JOptionPane.showInputDialog(null,"¿Cuál es la temperatura de "+ mes[i]+ "?"));
			Tpromedio[i]=t;
			for(i=0;i<12;i++) {
				if(Tpromedio[i]>Tpromedio[(int)Tmayor]) {
					Tmayor=i;
				}
			
			}
		
		JOptionPane.showMessageDialog(null,"La temperatura más alta fue en "+mes[i]+"\n La temperatura alcanzó los "+Tmayor+"°C");	
		
		}

	}
}
