import javax.swing.*;
import java.util.*;
public class MenuCuentas {
	public static void main(String[]args) {
		Cuenta catalogo[] = null;
		int num, op, i,j,n=0;
		String tit="";
		double saldo=0;
		
		Scanner entrada = new Scanner(System.in);
		i=0;
		j=0;
		
		op= Integer.parseInt(JOptionPane.showInputDialog(null,"0) Terminar\n 1) Alta\n 2) Baja\n 3)Consultar\n"));
		
		while(op!=0) {
			switch(op) {
			case 1: //Dar de alta la cuenta
				num= Integer.parseInt(JOptionPane.showInputDialog(null,"¿Número?"));
				j=0;
				while(j<i && num!= catalogo[j].getnumero()) {
					j++; // Este ciclo verifica si existe la cuenta
				}
				if(j==i) { //Si la cuenta no existe
					tit=JOptionPane.showInputDialog(null,"Titular de la cuenta:");
					saldo = Double.parseDouble(JOptionPane.showInputDialog(null,"¿Saldo?"));
					catalogo[i]= new Cuenta(num,tit,saldo);
					i++;
				}
				
			case 2:
				num = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuál es el número de cuenta?"));
				j=0;
				while(j<i&&catalogo[j].getnumero()!=num) {
					j++;
					if(j<i) {
						JOptionPane.showMessageDialog(null, "Cuenta: "+catalogo[i].toString());
						catalogo[j]= catalogo[i-1];
						catalogo[i-1]=null;
						i=i-1;
					}
					else {
						JOptionPane.showMessageDialog(null, "Cuenta no existe "+num);
					}
					break;
				}
				
			case 3: // Imprimir el catálogo
				for(j=0;j<i;j++) {
					JOptionPane.showMessageDialog(null,catalogo[i].toString());
				}
				
				break;
			}
			op= Integer.parseInt(JOptionPane.showInputDialog(null, "0) Terminar\n 1)Altas\n 2)Bajas\n 3)Consultar\n"));
		}
	}
}
