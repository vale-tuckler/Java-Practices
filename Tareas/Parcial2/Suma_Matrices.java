package Parcial2;
import javax.swing.*;
public class Suma_Matrices {
	
	//Escribir una aplicación llamada "Suma Matrices", que sume una matriz A y una matriz B y deje el resultado en una matriz C
	public static void main(String[]args) {
	
		int A[][],B[][],C[][],i,k, valor=0;
		int n,m,op;
		String r="";
		
		 
		op=Integer.parseInt(JOptionPane.showInputDialog(null,"¿De qué tamaño desea las matrices?\nCuadrada(1)\nDefinir(2)"));
		if(op==1) {
			n=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el tamaño de las matrices"));
			A = new int[n][n];
			B = new int[n][n];
			C= new int[n][n];
			
			for(k=0;k<n;k++) {
				for(i=0;i<n;i++) {
					valor= Integer.parseInt(JOptionPane.showInputDialog(null,"Valor de la matriz A en la posición ("+ k+", "+i+")\n"));
					A[k][i]= valor;
						
					valor= Integer.parseInt(JOptionPane.showInputDialog(null,"Valor de la matriz B en la posición ("+ k+", "+i+")"));
					B[k][i]=valor;
						
					C[k][i]= A[k][i]+B[k][i];
					r+=" [ "+C[k][i]+" ] ";
				}
					r+="\n";
			} 
				JOptionPane.showMessageDialog(null, "Matriz resultante C\n"+ r); 
		}
		
		if(op==2) {
			n=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el tamaño de las columnas"));
			m= Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el tamaño de las filas"));
			A=new int[n][m];
			B=new int[n][m];
			C=new int[n][m];
			
			for(k=0;k<n;k++) {
				for(i=0;i<m;i++) {
						
					valor= Integer.parseInt(JOptionPane.showInputDialog(null,"Valor de la matriz A en la posición ("+ k+", "+i+")\n"));
					A[k][i]= valor;
							
					valor= Integer.parseInt(JOptionPane.showInputDialog(null,"Valor de la matriz B en la posición ("+ k+", "+i+")"));
					B[k][i]=valor;
				
					C[k][i]= A[k][i]+B[k][i];
					r+=" [ "+C[k][i]+" ] ";
				}
				r+="\n";
			}
				JOptionPane.showMessageDialog(null, "Matriz resultante C\n"+ r);
		}
		if(op!=1 && op!=2){
			JOptionPane.showMessageDialog(null,"Operación inválida");
			}
		}//MAIN
	}//CLASE
	
	
	

