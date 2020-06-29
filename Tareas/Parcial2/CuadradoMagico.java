package Parcial2;
import javax.swing.*;
public class CuadradoMagico {
	public static void main(String[]args) {
		int c[][],t,i,k,n; // t = tamaño    n= números dentro del cuadro/cantidad de números
		int suma[],x=0;//x = media aritmética
		t = Integer.parseInt(JOptionPane.showInputDialog(null,"¿De qué tamaño desea el cuadrado mágico?\n Por favor, sólo dame números impares"));
		if(t%2==0) {
			JOptionPane.showMessageDialog(null,"Lo siento, no puedo crear un cuadrado con un tamaño par.\n\n"+"\t"+"Por favor, intentá de nuevo");
		}
		
		if(t%3==0) {
			c= new int[t][t];
			
			
			n = t*t;
			suma = new int[n];
			
			//PIDIENDO LOS NÚMEROS
			for(i=0;i<n;i++) {
				suma[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Qué número deseás colocar en el cuadro mágico?"));
				
			}
			//SACANDO EL PROMEDIO
			x+=suma[i];
				if(x%t==0) {
					x=x/t; //Encontrando el número mágico
				}
				
				
			
		}
		else {
			JOptionPane.showMessageDialog(null,"¡Terminé el cuadrado!");
		}
	}
}
