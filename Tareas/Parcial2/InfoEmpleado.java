package Parcial2;
import javax.swing.*;
public class InfoEmpleado {
	public static void main(String[]args) {
		int numero[],n,i; 
		String nombre[],r="";
		double salario[];
		
		n=Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuántos empleados son?"));
		numero=new int[n];
		nombre=new String[n];
		salario=new double[n];
		
		
		//CICLO PARA INTRODUCIR LOS DATOS EN LOS ARREGLOS
			for(i=0;i<n;i++) {
				numero[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuál es el número del empleado?"));
				nombre[i]=JOptionPane.showInputDialog(null,"¿Cuál es el nombre del empleado?");
				salario[i]=Double.parseDouble(JOptionPane.showInputDialog(null,"¿Cuál es el salario del empleado?"));
				
			}
		
			//CICLO PARA IMPRIMIR LOS DATOS SI EL SALARIO>5000
			for(i=0;i<n;i++) {
		if(salario[i]>5000) {
		
			r+="\nNúmero del empleado: "+numero[i];
			r+="\nNombre del empleado: "+nombre[i];
			r+="\nSalario del empleado: "+ salario[i];
			r+="\n\n";
			
	}
	else
		JOptionPane.showMessageDialog(null,"Los datos del empleado se mostrarán únicamente cuando el salario sea mayor a 5000, lo sentimos");
	
	}
			JOptionPane.showMessageDialog(null,"A continuación le mostraremos los datos del empleado con salario mayor a 5000: ");
			JOptionPane.showMessageDialog(null,r);
			
}

}
