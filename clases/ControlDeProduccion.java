import javax.swing.*;
import java.util.*;
public class ControlDeProduccion {
	
	public static void main(String[]args) {
		Maquina lista[], maq;
		int numero, horas, piezas,i,n=0; //"numero" se refiere al número de máquinas
		String desc="";
		
		//A
		lista = new Maquina[20];
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Número de máquinas?"));
		
		i=0;
		while(numero>0) {
			desc= JOptionPane.showInputDialog(null,"Descripción de la máquina");
			horas =Integer.parseInt(JOptionPane.showInputDialog(null,"¿Número de horas?"));
			piezas = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Número de piezas?"));
			 lista[i] = new Maquina(numero,desc,horas,piezas);
			 i++;
			 numero = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Número de máquinas?"));
							 
		}
		n=i;
		//B
		while(lista[i]!=null) {
			JOptionPane.showMessageDialog(null, lista[i].toString()+"\t"+lista[i].calcularProducciónSemanal());
			i++;
		}
		
		//C
		int total=0;
		for (i=0;i<n;i++) {
			total = lista[i].calcularProducciónSemanal();
		}
		System.out.println("Total de producción: "+ total);
		
		//D
		System.out.println("\"Horas trabajadas mayores a 40");
		for(i=0;i<n;i++) {
			if(lista[i].getHorasTrabajadas()>40) {
				System.out.println(lista[i].toString());
			}
		}
		
		//E
		maq = lista[0]; //maq está almacenando la dirección de un objeto
		for(i=1;i<n;i++) {
			if(lista[i].calcularProducciónSemanal() > maq.calcularProducciónSemanal()) {
				maq = lista[i];
			}
		}
		System.out.println("Máquina con mayor producción: "+ maq.toString());
		
		//F
		System.out.println("Promedio de producción: "+ (double)total/n); //El ciclo va a tomar "total" como double a la hora de
		//hacer la división
	}
	
	
	
	
	
}
