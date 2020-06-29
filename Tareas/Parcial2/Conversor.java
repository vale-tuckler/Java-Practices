package Parcial2;
import javax.swing.*;
public class Conversor {
	public static void main(String[]args) {
		int n,cifra,resultado=0,exp=0;
		
		n=Integer.parseInt(JOptionPane.showInputDialog(null,"¿Qué número binario desearías que convirtiera?"));
		do {
			cifra = n%10;
			resultado = resultado+cifra*(int)Math.pow(2,exp); 
			exp++;
			n=n/10;
		}
		while(n>0);
		
		JOptionPane.showMessageDialog(null,"El número en tu sistema decimal es: "+resultado);
	}
}
