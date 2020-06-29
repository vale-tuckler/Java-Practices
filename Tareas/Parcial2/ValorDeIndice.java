package Parcial2;
import javax.swing.*;
public class ValorDeIndice {
	//INSTRUCCIONES
	//1.	Llene cada posición de un vector con el
	//valor del índice de cada celda correspondiente e imprima el vector resultante.
		public static void main(String[]args) {
			int vector[], i,n;
			String r ="";
			
			n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es el tamaño del vector?"));
			vector=new int[n];
			
			for(i=0;i<n;i++) {
				vector[i]=i;
			}
			
			for(i=0;i<n;i++) {
		     r += "\n Esta es la posición: [" + vector[i] + "]";
		
		}
			JOptionPane.showMessageDialog(null,"A continuación un recorrido de las posiciones");
			JOptionPane.showMessageDialog(null, r);
	}
}
